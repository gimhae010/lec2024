package com.gimhae;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ex04 extends Frame implements MouseListener{
	JLabel btn;
	
	public Ex04() {
		ImageIcon icon=new ImageIcon("img01.jpg");
		setLayout(null);
		btn=new JLabel();
		btn.setIcon(icon);
		
		btn.setSize(100,50);
		btn.setLocation(100, 100);
		this.addMouseListener(this);
		add(btn);
		setBounds(-3840,100,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("클릭");
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("클릭버튼 누름");
		int x=e.getX();
		int y=e.getY();
		btn.setLocation(x-50,y-25);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("클릭버튼 위로");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		System.out.println("마우스가 위로");
	}

	@Override
	public void mouseExited(MouseEvent e) {
//		System.out.println("마우스가 밖으로");
	}

}
