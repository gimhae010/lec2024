package com.gimhae;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex07 extends Frame implements KeyListener{
	Label la;
	public Ex07() {
		setLayout(null);
//		TextField tf=new TextField();
//		Button btn=new Button("¹öÆ°");
		la=new Label("¡Ú");
		la.setSize(50, 50);
		la.setLocation(100, 100);
		this.addKeyListener(this);
//		add(tf);
//		add(btn);
		add(la);
		setBounds(-3840,100,400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==39) {
			int x=this.getWidth();
			if(la.getX()+10<x-10)
				la.setLocation(la.getX()+10, la.getY());
		}

		if(e.getKeyCode()==37) {
			if(la.getX()-10>0)
				la.setLocation(la.getX()-10, la.getY());
		}
		if(e.getKeyCode()==38) {
			la.setLocation(la.getX(), la.getY()-10);
		}
		if(e.getKeyCode()==40) {
			la.setLocation(la.getX(), la.getY()+10);
		}
		
	}

}
