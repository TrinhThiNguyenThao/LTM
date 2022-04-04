package Baidichso1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class Server

	public static void main(String[] args) {
	
	ServerSocket serverSocket;
	try {
		ServerSocket socketServer = new ServerSocket(9999);
		System.out.println("I'm listening on 9999 port ....");
		while (true)
		{
			Socket socketClient = socketServer.accept();
			OutputStream osToClient = socketClient.getOutputStream();
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffWrite = new BufferedWriter(write2Client);
			
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			
			    while (true) {
	                try {
	                    Socket socket = serverSocket.accept();
	                    System.out.println("Client accepted: " + socket);
	 
	                    OutputStream os = socket.getOutputStream();
	                    InputStream is = socket.getInputStream();
	                    int ch = 0;
	                    while (true) {
	                        ch = is.read(); // Receive data from client
	                        if (ch == -1) {
	                            break;
	                        }
	                        os.write(ch); // Send the results to client
	                    }
	                    socket.close();
	                } catch (IOException e) {
	                    System.err.println(" Connection Error: " + e);
	                }
	            }
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        } finally {
	            if (serverSocket != null) {
	                serverSocket.close();
	            }
	        }
	    }

	        
