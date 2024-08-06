package com.gimhae;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class Ex13 extends Frame{
	static TextField tf;
	public Ex13() {
		setLayout(new FlowLayout());
		
		tf=new TextField("±ÛÀÚ",15);
		add(tf);
		
		setSize(300,200);
		setLocation(-3000,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex13();
		String msg=tf.getText();
		System.out.println(msg);
	}

}
