package thuchanh64;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class server {
	public class  thuchanh64 extends Thread{
		Socket socketClient;
		int id = -1;
		
		public thuchanh64 (socket socketCLient, int id)
		{
			//super ();
			this.socketCLient = socketClient;
			this.id = id;
		}
		void GuiFile(String tenFile) throws IOException
		{
		// lay ve nhap tu file
		FileReader fr = new FileReader( tenFile);
		BufferedReader buffRead = new BufferedReader(fr);
		// lay luong ve xuat (de gui ve client)
		outputStream osToClient = socketClient.getoutputstream();
		 outputStreamWriter write2Client = new  outputStreamWriter(osToClient);
		// doc tung dong
		String line;
		while((line = buffRead.readLine()) != null)
		{
		// gui ve
		buffWrite.write(line);
		buffwrite.flush();
		}
		fr.close();
		}
	
	public void run ()
	 {
		 try {
			 Object socketClient;
			System.out.println( socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			// 
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffdWriter = new BufferedWriter(write2Client);
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			//============ 
				while(true) {
					String chuoiNhan=buffR.readLine();
					System.out.print("\n"+chuoiNhan);
					
					if(chuoiNhan.equals("1")) {
						guifile("D:\\1.txt");
					}
					else if(chuoiNhan.equals("2")) {
						guifile("D:\\2.txt");
						buffW.flush();
			}
			socketCLient.close();
		 }catch (Exeption e) {
			 System.out.println(e.getMessage());
			}
		 }
	 
	}
}
}

	
