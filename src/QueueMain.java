

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import server.NamedPipe;
import server.VMQueue;
//import java.io.RandomAccessFile;
import java.sql.SQLException;

import model.Job;
import model.NamedPipeStream;

public class QueueMain {
	private static File fPipe = new File("./pipe");
	private static File fLock = new File("./pipe.lock");

  public static void main(String[] args) throws InterruptedException, IOException, SQLException {
  	VMQueue queue = new VMQueue();
  	if (!fPipe.exists()) {
  		fPipe.createNewFile();
  	}
  	while(true) {
  		queue.processQueue();
  		// Read file - if null continue
  		// Else make lock file and read contents, remove contents, write file, remove lock
  		if (fPipe.length() != 0) {
  			if (!fLock.exists()) {
	  			fLock.createNewFile();
	  			String line;
	  			BufferedReader in = new BufferedReader(new FileReader(fPipe));
	  			while((line = in.readLine()) != null) {
	  				NamedPipeStream stream = new NamedPipeStream(line);
	  				Job job = queue.buildJob(stream);
	  				int queueNum = queue.addToQueue(job);
	  				System.out.println(queueNum + "NUMBER");
	  			}
	  			in.close();
	  			fPipe.delete();
	  			fPipe.createNewFile();
	  			fLock.delete();
	  		}
  		}
  		Thread.sleep(1000);
  	}
  }
}
