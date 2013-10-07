

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import server.VMQueue;
import java.sql.SQLException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import model.Job;
import model.NamedPipeStream;

public class QueueMain {
	private static File fPipe = new File("./pipe");
	private static File fLock = new File("./pipe.lock");
	private static boolean isLocked = false;
	
	private static Logger logger;
	
	static {
		try {
			Level logLevel = Level.SEVERE;
			
			logger = Logger.getLogger("vmqueue"); 
			logger.setLevel(logLevel);
			logger.setUseParentHandlers(false);
			
			Handler consoleHandler = new ConsoleHandler();
			consoleHandler.setLevel(logLevel);
			consoleHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(consoleHandler);

			FileHandler fileHandler = new FileHandler("log.txt", true);
			fileHandler.setLevel(logLevel);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
			
		} catch (IOException e) {
			System.out.println("Could not initialize log: " + e.getMessage());
		}
	}
	
  public static void main(String[] args) throws InterruptedException, IOException, SQLException {
  	int port = Integer.parseInt(args[0]);
  	String database = args[1];
  	VMQueue queue = new VMQueue(port, database);
  	while(true) {
  		try {
	  		queue.processQueue();
	  		// Read file - if null continue
	  		// Else make lock file and read contents, remove contents, write file, remove lock
        if (fPipe.length() != 0) {
          if (!fLock.exists()) {
		  			fLock.createNewFile();
		  			isLocked = true;
		  			String line;
		  			BufferedReader in = new BufferedReader(new FileReader(fPipe));
		  			logger.info("READING FILE");
            while((line = in.readLine()) != null) {
		  				NamedPipeStream stream = new NamedPipeStream(line);
		  				Job job = queue.buildJob(stream);
		  				int queueNum = queue.addToQueue(job);
		  				//logger.info(queueNum + "NUMBER");
		  			}
		  			in.close();
		  			fPipe.delete();
		  			fLock.delete();
		  			isLocked = false;
		  		} 
	  		}
	  		Thread.sleep(800);
  		} finally {
  			if (isLocked) {
  				fLock.delete();
  				isLocked = false;
  			}
  		}
  	}
  }
}
