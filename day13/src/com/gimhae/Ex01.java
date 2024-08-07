package com.gimhae;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Ex01 extends Frame{
	
	public Ex01() {
		java.awt.Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screen=kit.getScreenSize();
		int scrW,scrH;
		scrW=screen.width;
		scrH=screen.height;
		
		Dimension app=new Dimension(300, 400);
		
		this.setSize(app);
		this.setLocation(scrW/2-app.width/2,scrH/2-app.height/2);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
