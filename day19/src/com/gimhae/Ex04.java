package com.gimhae;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;

public class Ex04 {
	// server
	public static void main(String[] args) {
		int port=6000;
		java.net.ServerSocket serv=null;
		java.net.Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		try {
			serv=new ServerSocket(port);
			System.out.println("waiting...");
			sock=serv.accept();
			InetAddress addr = sock.getInetAddress();
			is=sock.getInputStream();
			os=sock.getOutputStream();
			byte[] buf=new byte[10];
			is.read(buf);
			System.out.println("connection...:"+addr.getHostAddress());
			System.out.println(new String(buf));
			os.write("welcome".getBytes());
			os.write(255);
			while(true) {
				int su=is.read();
				if(su==-1)break;
				System.out.print((char)su);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
				if(serv!=null)serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}










