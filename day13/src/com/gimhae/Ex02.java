package com.gimhae;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex02 extends Frame implements WindowListener{
	public Ex02() {
		addWindowListener(this);
		setBounds(-3840,100,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex02();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("â�� ����");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Closing");
		//setVisible(false);
//		System.exit(0);
		dispose();//GUI ����
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("����� �����۾�");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("â �ּ�ȭ");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("â �ּ�ȭ����");		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("â ����");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("â ��������");
	}

}
