package com.step03;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server implements Runnable {
	static ArrayList<Socket> list;
	Socket sock;
	
	public Server(Socket sock) {
		this.sock=sock;
	}
	
	public void sendAll(String msg) {
		for(int i=0; i<list.size(); i++) {
			Socket sock=list.get(i);
			try{
				OutputStream os = sock.getOutputStream();
				PrintStream ps=new PrintStream(os);
				ps.println(msg);
				ps.flush();
			} catch (IOException e) {
				list.remove(sock);
			}
		}
	}
	
	@Override
	public void run() {
		try {
			InputStream is=sock.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			while(true) {
				String msg=br.readLine();
				sendAll(sock.getInetAddress().getHostAddress()+">"+msg);
			}
		} catch (IOException e) {
			list.remove(sock);
		}
	}
	public static void main(String[] args) {
		list=new ArrayList<>();
		try(
				ServerSocket serv=new ServerSocket(6000);
		){
			while(true) {
				Socket sock = serv.accept();
				Server me=new Server(sock);
				Thread thr=new Thread(me);
				thr.start();
				list.add(sock);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
