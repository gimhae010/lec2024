package com.gimhae;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex12 {

	public static void main(String[] args) {
		Frame f=new Frame();

		Panel p=new Panel();
//		p.setLayout(new FlowLayout());
		p.setBackground(Color.PINK);
		
		Button btn=new Button("button");
		Font font=Font.getFont(Font.SANS_SERIF);
		btn.setFont(font);
		btn.setBackground(Color.BLUE);
		btn.setForeground(Color.WHITE);
		p.add(btn);
		
		JButton btn2=new JButton("스윙버튼");
		btn2.setFont(Font.getFont("궁서체"));
		Icon defaultIcon=new ImageIcon("logo.jpg");
		btn2.setIcon(defaultIcon);
		
		p.add(btn2);
		f.add(p);
		f.setTitle("제목없음");
		f.setSize(500, 200);
		f.setLocation(-3000, 100);
		f.setVisible(true);
	}

}
