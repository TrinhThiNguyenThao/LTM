package thuchanh64;

import java.io.BufferedReader;

import java.io.BufferedWriter;

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

				

				OutputStream osToClient;

				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);

				 BufferedWriter buffWrite = new BufferedWriter(write2Client);

			

				 Scanner banPhim = new Scanner(System.in);

				 while(true)

				 {

					 System.out.println("\n Client:");

					 String chuoiGui = banPhim.nextLine();

					 

					 buffWrite.write(chuoiGui+"\n");

					 buffWrite.flush();

					 

					 String chuoiNhan = BuffRead.readLine();

					 System.out.print("Server:"+ chuoiNhan);

					 

					 if(chuoiGui.equals("10")) break;

				 }

				 socket.close();
			}catch(Exception e)
			{
			System.out.println(e.getMessage()); 
			}
		}

			}

