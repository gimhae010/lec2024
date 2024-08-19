package com.step01;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int port=6000;
		Socket sock=null;
		OutputStream os=null;
		PrintStream ps=null;
		try {
			sock=new Socket(InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,54,71}),port);
			os=sock.getOutputStream();
			ps=new PrintStream(os);
			while(true) {
				System.out.print("client>>");
				String msg=sc.nextLine();
				ps.println(msg);
				ps.flush();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null)ps.close();
				if(os!=null)os.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
