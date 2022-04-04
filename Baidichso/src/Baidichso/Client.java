package Baidichso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	

	private static final BufferedReader BuffRead = null;

	public static void main(String[] args) {
		Socket soc;
		try {
			soc = new Socket("localhost", 9999);
			System.out.println("Connected! \n");
			
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			
			 OutputStream osToClient = soc.getOutputStream();
			
			OutputStream osToClient1 = null;
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient1);
			 BufferedWriter buffWrite = new BufferedWriter(write2Client);
		
			 for (int i = '0'; i <= '9'; i++) {
                BufferedWriter os;
				os.write(i); // Send each number to the server
                BufferedReader is;
				int ch = is.read(); // Waiting for results from server
                System.out.print((char) ch + " "); // Display the results received from the server
                Thread.sleep(200);
            }
        } catch (IOException ie) {
            System.out.println("Can't connect to server");
        } finally {
            Object socket;
			if (socket != null) {
                socket.clone();
            }
        }
    }
}