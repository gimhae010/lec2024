package com.gimhae;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex05 {
	// client
	public static void main(String[] args) {
		byte[] ip=new byte[] {(byte)192,(byte)168,54,71};
		int port=6000;
		java.net.Socket sock=null;
		OutputStream os=null;
		InputStream is=null;
		try {
			InetAddress addr = InetAddress.getByAddress(ip);
			sock=new Socket(addr,port);
			os=sock.getOutputStream();
			is=sock.getInputStream();
			os.write("hello java".getBytes());
			while(true) {
				int su=is.read();
				//if(su==-1)break;
				if(su==255)break;
				System.out.print((char)su);
			}
			os.write("me too".getBytes());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null)is.close();
				if(os!=null)os.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
