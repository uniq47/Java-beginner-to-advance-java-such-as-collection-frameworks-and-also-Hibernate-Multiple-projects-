/**
 * 
 */
package lab1_1;

/**
 * @author Nabin Gautam, Unique Sapkota
 *
 */
import java.net.*;
import java.io.*;

public class QuoteClient {
	public static void main(String[] args) {
		try {
			//make connection to server socket
			Socket socket = new Socket("127.0.0.1", 6017);
			InputStream in = socket.getInputStream(); // reading socket input stream
			BufferedReader buffer = new BufferedReader(new InputStreamReader(in)); // read the date from the socket
			String line;
			while ((line = buffer.readLine()) != null) // setting quote from buffer to string 'line'
				System.out.println(line); // printing the quote 
			socket.close(); // closing socket connection after serving the quote to client
		} catch (IOException ioe) { // catching exception error
			System.err.println(ioe);
		}
		
	}
}