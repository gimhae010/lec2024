package com.gimhae;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.LayoutManager;

public class Ex07 extends java.awt.Frame{
	// 배치 - 배치관리자
	// 요소 - ui컴포넌트 종류 사용법
	
	public Ex07() {
		// 배치관리자 - 상대속성, 절대속성
		// FlowLayout 가운데 정렬, 컴포넌트의 배치,크기x
		// 컨텐츠크기에 맞춰 사이즈
		
		// gridLayout
		
		Font f=new Font("Candara", 0, 30);
		LayoutManager lm=new GridLayout(2,2);
		this.setLayout(lm);
		java.awt.Button btn=new Button();
//		btn.setFont(f);
		btn.setLabel("첫번째 버튼");
//		btn.setSize(500, 100);
//		btn.setLocation(500, 500);
		java.awt.Button btn2=new Button();
		btn2.setLabel("두번째 버튼");
		java.awt.Button btn3=new Button();
		btn3.setLabel("세번째 버튼");
		java.awt.Button btn4=new Button();
		btn4.setLabel("네번째 버튼");
		java.awt.Button btn5=new Button();
		btn5.setLabel("다섯번째 버튼");
		java.awt.Button btn6=new Button();
		btn6.setLabel("여섯번째 버튼");
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
		// awt		1.0~ 	os요청		빠르고 자원소모 운영체체종속
		// swing	1.2~	java drow 	awt못하는것 세련(롱혼)
		Ex07 me=new Ex07();
		GraphicsEnvironment ge = null;

        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        Font[] fonts = ge.getAllFonts();

       

        for(int i=0; i<fonts.length;i++){

               System.out.println(fonts[i].getFontName());

        }
	}

}
