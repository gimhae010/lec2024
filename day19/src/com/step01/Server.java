package com.step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	// 다중 접속 허용
	public static void main(String[] args) {
		int port=6000;
		ServerSocket serv=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			serv=new ServerSocket(port);
			while(true) {
				Socket sock = serv.accept();
				is=sock.getInputStream();
				isr=new InputStreamReader(is);
				br=new BufferedReader(isr);
				while(true) {
					String msg=br.readLine();
					System.out.println(sock.getInetAddress().getHostAddress()+">>"+msg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null)is.close();
				if(serv!=null)serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
