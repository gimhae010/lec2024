package com.gimhae;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex02 extends Frame{
	
	public Ex02() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setBounds(-3840,50,500,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex02 me=new Ex02();
		me.newFrame();
	}

	public void newFrame() {
//		java.awt.Dialog dia=new Dialog(this,"dialog",true);
		java.awt.FileDialog dia=new FileDialog(this,"dialog",FileDialog.SAVE);
		dia.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dia.dispose();
			}
		});
		dia.setBounds(-3000,50,300,200);
		dia.setVisible(true);
		String dir=dia.getDirectory();
		String name=dia.getFile();
		System.out.println(dir+name);
	}
}














