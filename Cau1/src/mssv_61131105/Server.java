package mssv_61131105;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Server {
	
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
	/*	void GuiFile(String tenFile , BufferedWriter bf) throws IOException
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
	*/
	
	public void run  () 
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
					
					String chuoiGui = null;
					BufferedWriter buffW = null;
					if(chuoiNhan.equals("1")) {
						buffWrite.write(chuoiGui+"le");
						BufferedWriter buff;
						buffW.flush();
					}
					else if(chuoiNhan.equals("2")) {
						buffWrite.write(chuoiGui+"chan");
						buffW.flush();
					}
					else if(chuoiNhan.equals("3")) {
						buffWrite.write(chuoiGui+"le");
						buffW.flush();
					}
					else if(chuoiNhan.equals("4")) {
						buffWrite.write(chuoiGui+"chan");
						buffW.flush();
					}
					else if(chuoiNhan.equals("5")) {
						buffWrite.write(chuoiGui+"le");
						buffW.flush();
					}
					else if(chuoiNhan.equals("6")) {
						buffWrite.write(chuoiGui+"chan");
						buffW.flush();
					}
					else if(chuoiNhan.equals("7")) {
						buffWrite.write(chuoiGui+"le");
						buffW.flush();
					}
						else if(chuoiNhan.equals("8")) {
							buffWrite.write(chuoiGui+"chan");
							buffW.flush();
						}
						else if(chuoiNhan.equals("9")) {
							buffWrite.write(chuoiGui+"le");
							buffW.flush();
						}
						else if(chuoiNhan.equals("10")) {
							buffWrite.write(chuoiGui+"chan");
							buffW.flush();
						}
			}
			//socketCLient.close();
		 }    catch ( IOException e) {
			 System.out.println(e.getMessage());
		 
}
}
	}

}
