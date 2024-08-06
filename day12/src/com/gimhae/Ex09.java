package com.gimhae;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.util.Scanner;

public class Ex09 extends Frame{
	CardLayout lm=new CardLayout();
	
	public Ex09() {
		this.setLayout(lm);
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		
		Color c1=new Color(255, 0, 0);
		Color c2=new Color(0, 255, 0);
		Color c3=new Color(0, 0, 255);
		Color c4=new Color(200, 0, 200);
		p1.setBackground(c1);
		p2.setBackground(c2);
		p3.setBackground(c3);
		p4.setBackground(c4);
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
		setSize(300, 600);
		setLocation(-3000, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ex09 me=new Ex09();
		while(true) {
			int su=sc.nextInt();
			if(su==0)break;
			me.lm.next(me);
		}
	}

}














