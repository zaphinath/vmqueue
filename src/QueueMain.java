

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import server.NamedPipe;
import server.VMQueue;
import java.io.RandomAccessFile;

import model.NamedPipeStream;

public class QueueMain {

  public static void main(String[] args) throws InterruptedException, IOException {
    //VMQueue queue = new VMQueue();
    //File pipe = new File("/var/www/insidesales/pipefile");
  	NamedPipe pipe = new NamedPipe();
  	while(true) {
  		NamedPipeStream stream = pipe.readPipe();
  		Thread.sleep(1000);
  		// Loop through queue and process jobs
  	}
  }
}
