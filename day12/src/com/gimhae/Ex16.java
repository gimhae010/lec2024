package com.gimhae;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Frame;

public class Ex16 {

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(200,200);
		f.setLocation(-3300,100);
		f.setVisible(true);
		
		Choice cho1=new Choice();
		cho1.addItem("item1");
		cho1.addItem("item2");
		cho1.addItem("item3");
		cho1.addItem("item4");
		
//		cho1.select("item3");
		cho1.select(1);
		
		f.add(cho1);
		
		java.awt.List list=new List(5,true);
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.add("item5");
		
		f.add(list);
		
		JLabel la=new JLabel();
//		la.setText("글자쓰기");
		la.setIcon(new ImageIcon("logo.jpg"));
		f.add(la);
	}

}




