package com.gimhae;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex08 extends Frame implements TextListener{
	public Ex08() {
		setLayout(new FlowLayout());
		
		TextField tf;
		tf=new TextField(15);
		tf.addTextListener(this);
		add(tf);
		setBounds(-3840,100,300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex08();
	}
	@Override
	public void textValueChanged(TextEvent e) {
		TextField tf=(TextField)e.getSource();
		System.out.println(tf.getText());
	}

}













