package com.gimhae;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ex05 extends Frame implements MouseMotionListener{
	JLabel la;
	public Ex05() {
		setLayout(null);
		addMouseMotionListener(this);
		ImageIcon icon=new ImageIcon("img01.jpg");
		la=new JLabel(icon);
//		setSize(icon.getIconWidth(),icon.getIconHeight());
		la.setSize(100,50);
		la.setLocation(100, 100);
		add(la);
		setBounds(-3840,100,500,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex05();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("µå·¹±×");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//System.out.println(e.getX()+":"+e.getY());
		la.setLocation(e.getX(),e.getY());
	}

}
