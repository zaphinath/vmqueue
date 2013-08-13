

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import server.VMQueue;
import java.sql.SQLException;

import model.Job;
import model.NamedPipeStream;

public class QueueMain {
	private static File fPipe = new File("./pipe");
	private static File fLock = new File("./pipe.lock");
	private static boolean isLocked = false;
	
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
		  			System.out.println("READING FILE");
            while((line = in.readLine()) != null) {
		  				NamedPipeStream stream = new NamedPipeStream(line);
		  				Job job = queue.buildJob(stream);
		  				int queueNum = queue.addToQueue(job);
		  				System.out.println(queueNum + "NUMBER");
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
