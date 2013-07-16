

import java.io.File;
import server.VMQueue;
import java.io.RandomAccessFile;

public class QueueMain {

  public static void main(String[] args) {
    VMQueue queue = new VMQueue();
    File pipe = new File("/var/www/insidesales/pipefile");
    RandomAccessFile rafile = new RandomAccessFile(pipe, "rw");
    
    while(1) {


    }
  }
}
