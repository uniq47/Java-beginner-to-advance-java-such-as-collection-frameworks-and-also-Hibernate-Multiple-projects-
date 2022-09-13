/**
 * 
 */
package lab1_2;

/**
 * @author Nabin Gautam, Unique Sapkota
 *
 */

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class EchoClient {
	public static void main(String args[]) throws IOException {
		{
			try {
				String host  = "127.0.0.1";
				int port = 6017;
				Socket socket = new Socket(host, port);
				System.out.println("Client connected to the server: " + host + " : " + port);

				PrintWriter PrintWriter = new PrintWriter(socket.getOutputStream());
				BufferedReader BufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				Scanner input = new Scanner(System.in);
				
				while (true) {
					System.out.print("> ");
					String userText = input.nextLine();

					PrintWriter.println(userText);
					PrintWriter.flush();

					if (userText.equalsIgnoreCase(".end")) {
						System.out.println("Connection will now terminate. Thank you for joining the server!");
						socket.close();
						break;
					}
					
						String buffMsg = BufferedReader.readLine();
						System.out.println("Server: " + buffMsg);
					}

				input.close();
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}

		}
	}
}