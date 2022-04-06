package thuchanh64;

		import java.net.ServerSocket;
		import java.net.Socket;

				public class CTChinh {
					
					public static void main (String[] args) throws IOExeption {
						// mo cong va bat dau nghe
						
						ServerSocket socketServer = new ServerSocket(9999);
						System.out.println("i'm listening on 9999 port....");
						//
						int id = 0;
						while(true) {
							Socket s = socketServer.accept();
							id ++;
							socket socket;
							
							server fileTask = new server(socket, id);
							fileTask.start();
						}
					}
				}
				   
