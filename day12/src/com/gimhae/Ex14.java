package com.gimhae;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;

public class Ex14 {

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setLayout(new FlowLayout());
		
		TextArea ta=new TextArea("�ʱⰪ",5,15,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setFont(new Font(Font.SERIF,Font.PLAIN,20));
		ta.setBackground(Color.GRAY);
		ta.setForeground(Color.RED);
		f.add(ta);
		
		f.setSize(400,300);
		f.setLocation(-3000,100);
		f.setVisible(true);

	}

}
