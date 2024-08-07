package com.gimhae;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex10 extends Frame implements ActionListener{
	// ������Ʈ ������ �̺�Ʈ ����
	Button btn;
	TextField tf;
	
	
	public Ex10() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setLayout(new FlowLayout());
		btn=new Button("��ư");
		tf=new TextField(15);
		tf.setEchoChar('#');
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ưŬ��");
			}
			
		});
//		btn.addActionListener( e -> System.out.println("Ŭ��"));
		tf.addActionListener(this);
		add(btn);
		add(tf);
		setBounds(-3840,100,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex10();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tf)
		System.out.println("Call event.."+e.getActionCommand());
//		if(e.getSource()==btn)
//		System.out.println("��ưŬ��");
	}

}









