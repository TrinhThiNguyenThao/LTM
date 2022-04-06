package thuchanh64;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

	public class  server extends Thread {
		Socket socketClient;
		int id = -1;
		private BufferedWriter buffWrite;
		
		public server (Socket socketCLient, int id)
		{
			//super ();
			this.socketClient = socketClient;
			this.id = id;
		}
		void GuiFile(String tenFile , BufferedWriter bf) throws IOException
		{
		// lay ve nhap tu file
			
		FileReader fr = new FileReader( tenFile);
		BufferedReader buffRead = new BufferedReader(fr);
		
		// lay luong ve xuat (de gui ve client)
		OutputStream osToClient = socketClient.getOutputStream();
		 OutputStreamWriter write2Client = new  OutputStreamWriter(osToClient);
		 
		// doc tung dong
		String line;
		while((line = buffRead.readLine()) != null)
		{
		buffWrite = null;
		// gui ve
		buffWrite.write(line);
		buffWrite.flush();
		}
		fr.close();
		}
	
	
	
	public void run ()
	 {
		 try {
			 
			System.out.println( socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			OutputStream osToClient = null ;
			// 
			OutputStreamWriter write2Client = new OutputStreamWriter( osToClient);
			BufferedWriter buffdWriter = new BufferedWriter(write2Client);
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			//============ 
				while(true) {
					BufferedReader buffR = null;
					String chuoiNhan=buffR.readLine();
					System.out.print("\n"+chuoiNhan);
					
					if(chuoiNhan.equals("1")) {
						GuiFile("D:\\1.txt", buffdWriter);
					}
					else if(chuoiNhan.equals("2")) {
						GuiFile("D:\\2.txt", buffdWriter);
						//buffW.flush();
					}
					else if(chuoiNhan.equals("3")) {
						GuiFile("D:\\3.txt", buffdWriter);
						//buffW.flush();
					}
					else if(chuoiNhan.equals("4")) {
						GuiFile("D:\\4.txt", buffdWriter);
						//buffW.flush();
					}
					else if(chuoiNhan.equals("5")) {
						GuiFile("D:\\5.txt", buffdWriter);
						//buffW.flush();
					}
					else if(chuoiNhan.equals("6")) {
						GuiFile("D:\\6.txt", buffdWriter);
						//buffW.flush();
					}
					else if(chuoiNhan.equals("7")) {
						GuiFile("D:\\7.txt", buffdWriter);
						//buffW.flush();
					}
						else if(chuoiNhan.equals("8")) {
							GuiFile("D:\\8.txt", buffdWriter);
							//buffW.flush();
						}
						else if(chuoiNhan.equals("9")) {
							GuiFile("D:\\9.txt", buffdWriter);
							//buffW.flush();
						}
						else if(chuoiNhan.equals("10")) {
							GuiFile("D:\\10.txt", buffdWriter);
							//buffW.flush();
						}
			}
			//socketCLient.close();
		 }    catch ( IOException e) {
			 System.out.println(e.getMessage());
		 
}
}
	}
	
