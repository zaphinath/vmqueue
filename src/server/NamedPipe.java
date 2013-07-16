/**
 * 
 */
package server;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import model.NamedPipeStream;

/**
 * @author Derek Carr
 *
 */
public class NamedPipe {
	private RandomAccessFile pipe;
	
	public NamedPipe() throws FileNotFoundException {
		pipe = new RandomAccessFile("./pipe", "rw");		
	}

	public NamedPipeStream readPipe() throws IOException {
		String next =  pipe.readLine();
		String[] tmpString;
		NamedPipeStream stream;
		if (next != null) {
			tmpString = next.split(",");
			stream = new NamedPipeStream(tmpString);
		} else {
			tmpString = null;
			stream = null;
		}
		return stream;
	}
}
