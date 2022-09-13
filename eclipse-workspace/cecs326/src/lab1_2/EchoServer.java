/**
 * 
 */
package lab1_2;

/**
 * @author Nabin Gautam, Unique Sapkota
 *
 */
//A Java program for a Server
import java.net.*;
import java.io.*;

public class EchoServer
{
// constructor with port

public static void main(String args[])
{
    // starts server and waits for a connection
    try
    {
    	int port = 6017;
    	ServerSocket socket = new ServerSocket(port);
        System.out.println("Server started: localhost" + port); // displaying messages to inform client

        System.out.println("Waiting for a client to join ...");
        
        while(true) { // loops forever until something breaks the loops inside
        Socket client = socket.accept(); // accept client connection
        System.out.println("Client joined the server!"); // informing the client they've joined the server


        // takes input from the client socket
        BufferedReader BufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream())); //
      //to write back to the client
	      PrintWriter PrintWriter = new PrintWriter(client.getOutputStream());

	      while(true) {
		      String userInput = BufferedReader.readLine();
		      if(userInput.equalsIgnoreCase("Hello there! I am the client."))
		    	  userInput = userInput.replace("client", "server");
		      System.out.println("Client: " + userInput);
		      PrintWriter.println(userInput);
		      PrintWriter.flush();
         		
		      if(userInput.equalsIgnoreCase(".end")) { // if userinput equals .end, terminate the socket connection
		    	  System.out.println("Client terminated the connection!!!");
		    	  socket.close(); // closing socket connection
		    	  break; // it breaks the loop
		      }
	      }
        }
    }
    catch(IOException i) // catching exception
    {
        System.out.println("Error: " + i);
    }
}
}