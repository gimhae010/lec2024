package com.gimhae;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.LayoutManager;

public class Ex07 extends java.awt.Frame{
	// ��ġ - ��ġ������
	// ��� - ui������Ʈ ���� ����
	
	public Ex07() {
		// ��ġ������ - ���Ӽ�, ����Ӽ�
		// FlowLayout ��� ����, ������Ʈ�� ��ġ,ũ��x
		// ������ũ�⿡ ���� ������
		
		// gridLayout
		
		Font f=new Font("Candara", 0, 30);
		LayoutManager lm=new GridLayout(2,2);
		this.setLayout(lm);
		java.awt.Button btn=new Button();
//		btn.setFont(f);
		btn.setLabel("ù��° ��ư");
//		btn.setSize(500, 100);
//		btn.setLocation(500, 500);
		java.awt.Button btn2=new Button();
		btn2.setLabel("�ι�° ��ư");
		java.awt.Button btn3=new Button();
		btn3.setLabel("����° ��ư");
		java.awt.Button btn4=new Button();
		btn4.setLabel("�׹�° ��ư");
		java.awt.Button btn5=new Button();
		btn5.setLabel("�ټ���° ��ư");
		java.awt.Button btn6=new Button();
		btn6.setLabel("������° ��ư");
		this.add(btn);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
//		this.add(btn6);
		this.setLocation(-3840, 300);
		this.setSize(500, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// GUI
		// awt		1.0~ 	os��û		������ �ڿ��Ҹ� �üü����
		// swing	1.2~	java drow 	awt���ϴ°� ����(��ȥ)
		Ex07 me=new Ex07();
		GraphicsEnvironment ge = null;

        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        Font[] fonts = ge.getAllFonts();

       

        for(int i=0; i<fonts.length;i++){

               System.out.println(fonts[i].getFontName());

        }
	}

}
