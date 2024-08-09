package com.gimhae;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Ex03 {

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setTitle("제목");
//		Image img2=Toolkit.getDefaultToolkit().createImage("log.jpg");
		ImageIcon icon=new ImageIcon("log.jpg");
		Image img=icon.getImage();
		f.setIconImage(img);
		
		MenuBar mb=new MenuBar();
		Menu m2=new Menu("메뉴2");
		Menu mi4=new Menu("2첫번째");
		
		MenuItem mi5=new MenuItem("2두번째");
		MenuItem mi6=new MenuItem("2세번째");
		Menu m1=new Menu("메뉴1");
		MenuItem mi1=new MenuItem("1첫번째");
		MenuItem mi2=new MenuItem("1두번째");
		MenuItem mi3=new MenuItem("1세번째");
		
		mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("메뉴 선택");
			}
		});
		m1.add(mi1);
		m1.add(mi2);
		m1.addSeparator();
		m1.add(mi3);
		m2.add(mi4);
		mi4.add(mi5);
		mi4.add(mi6);
		mb.add(m1);
		mb.add(m2);
		f.setMenuBar(mb);

		f.setSize(500,300);
		f.setLocation(-3840,50);
		f.setVisible(true);
	}

	
	
	
	
	
	
}
