package com.gimhae;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class Ex24 {
	static TextArea ta;
	static Frame f;
	static File file;

	public static void main(String[] args) {
		// 메모장
		f=new Frame("제목없음");
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		MenuItem mi1=new MenuItem("새파일");
		MenuItem mi2=new MenuItem("열기");
		MenuItem mi3=new MenuItem("저장");
		MenuItem mi4=new MenuItem("다른이름으로저장");
		MenuItem mi5=new MenuItem("종료");
		MenuItem mi6=new MenuItem("정보");
		mi6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog dia=new Dialog(f);
				dia.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						dia.dispose();
					}
				});
				dia.setLayout(new BorderLayout());
				dia.add(new Label("프로그램 정보",Label.CENTER),BorderLayout.CENTER);
				Button btn=new Button("확인");
				btn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						dia.dispose();
					}
				});
				dia.add(btn,BorderLayout.SOUTH);
				dia.setBounds(f.getX()+100,f.getY()+100,300,200);
				dia.setVisible(true);
				
			}
		});
		
		mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				file=null;
				f.setTitle("제목없음");
			}
		});
		
		mi2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				file=fileOpen();
				String msg=fileLoad(file);
				ta.setText(msg);
			}
		});
		mi3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(file==null)
					file=fileSave();
				save(file);
			}
		});
		mi4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				File file=fileSave();
				save(file);
			}
		});
		mi5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		
		Menu mn1=new Menu("파일");
		mn1.add(mi1);
		mn1.add(mi2);
		mn1.addSeparator();
		mn1.add(mi3);
		mn1.add(mi4);
		mn1.addSeparator();
		mn1.add(mi5);
		Menu mn2=new Menu("도움말");
		mn2.add(mi6);
		
		MenuBar mb=new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		
		ta=new TextArea();
		f.add(ta);
		f.setMenuBar(mb);
		f.setBounds(-3840,50,500,400);
		f.setVisible(true);
		
		
	}

	public static File fileOpen() {
		FileDialog dia=new FileDialog(f);
		dia.setVisible(true);
		String path=dia.getDirectory();
		String name=dia.getFile();
		f.setTitle(name);
		return new File(path+name);
	}
	
	public static File fileSave() {
		FileDialog dia=new FileDialog(f,"",FileDialog.SAVE);
		dia.setVisible(true);
		String path=dia.getDirectory();
		String name=dia.getFile();
		f.setTitle(name);
		return new File(path+name);
	}
	
	public static String fileLoad(File f) {
		String msg="";
		String temp="";
		try(
				Reader fr=new FileReader(f);
				BufferedReader br=new BufferedReader(fr);
				){
			while((temp=br.readLine())!=null) {
				msg+=temp+"\n";
			}
		} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		
		return msg;
	}
	public static void save(File f) {
		String msg=ta.getText();
		try(
				Writer fw=new FileWriter(f);
				BufferedWriter bw=new BufferedWriter(fw);
				){
				bw.write(msg);
		} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
}


















