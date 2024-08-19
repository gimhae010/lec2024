package com.step03;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class Client extends Frame implements ActionListener {
	TextField tf;
	static PrintStream ps;
	
	public Client() {
		tf=new TextField();
		tf.addActionListener(this);
		add(tf);
		setBounds(-3840,100,300,80);
		setVisible(true);
	}

	public static void main(String[] args) {
		Client me=new Client();
		int port=6000;
		try(
				Socket sock=new Socket("127.0.0.1",port);
				InputStream is=sock.getInputStream();
				OutputStream os=sock.getOutputStream();
				InputStreamReader isr=new InputStreamReader(is);
				BufferedReader br=new BufferedReader(isr);
				){
			ps=new PrintStream(os);
			while(true) {
				String msg=br.readLine();
				System.out.println(msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=tf.getText();
		ps.println(msg);
		ps.flush();
		tf.setText("");
	}

}
