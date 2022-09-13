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

public class QuoteServer {
	public static void main(String[] args) {
		try {
			ServerSocket sock = new ServerSocket(6017); // creating new socket connection to port 6017
			System.out.println("Server started! \nPlease run the client file to receive the quote of the day."); // displaying message
				/* now listen for connections */
			while (true) { // loops forever until something inside the loop breaks it
				Socket client = sock.accept(); // accepting socket connection
				
				PrintWriter pout = new PrintWriter(client.getOutputStream(), true); //using to write to the client buffer
				
				/* write the Quote of the Day to the socket */
				String quote = "Reality can be whatever i want.";
				pout.println(quote.toString()); // changing quote to string format
				
				/* close the socket and resume */
				/* listening for connections */
				sock.close();
			}
		} catch (IOException ioe) {
			System.err.println(ioe);
		}
	}
}