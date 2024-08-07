package com.gimhae;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex06 extends Frame implements KeyListener{
	TextField tf;
	
	public Ex06() {
		setLayout(new FlowLayout());
		tf=new TextField(15);
		tf.addKeyListener(this);
		add(tf);
		setBounds(-3840,100,500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex06();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.print("Call keyTyped"+e.getKeyCode()+","+e.getKeyChar());
		System.out.println("=>"+tf.getText());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.print("Call keyPressed"+e.getKeyCode()+","+e.getKeyChar());
		System.out.println("=>"+tf.getText());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.print("Call keyReleased"+e.getKeyCode()+","+e.getKeyChar());
		System.out.println("=>"+tf.getText());
	}

}
