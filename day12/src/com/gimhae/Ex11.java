package com.gimhae;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex11 extends Frame{
	
	public Ex11() {
		Panel p=new Panel();
		p.setLayout(null);// 절대
		Button btn=new Button();
		btn.setLabel("버튼");
		btn.setLocation(100, 100);
		btn.setSize(100, 100);

		Button btn2=new Button();
		btn2.setLabel("버튼2");
		btn2.setLocation(0, 0);
		btn2.setSize(100, 100);
		
		p.add(btn);
		p.add(btn2);
		
		add(p);
		setSize(400, 400);
		setLocation(-3000,100);
		setVisible(true);
		setResizable(false);
		System.out.println(p.getSize());
	}

	public static void main(String[] args) {
		new Ex11();
	}

}
