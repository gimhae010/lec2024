package com.gimhae;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Ex13 implements ActionListener{
	List<String[]> data=new ArrayList<>();
	static TextField[] adds;
	static Panel center=new Panel();
	static Frame f;
	
	public static void main(String[] args) {
		// �л������������α׷�(ver 0.9.0)
		f=new Frame("�л������������α׷�(ver 0.9.0)");
		f.setLayout(new BorderLayout());
		Panel top=new Panel();
		top.setLayout(new FlowLayout());
		center.setLayout(new FlowLayout());
		adds=new TextField[5];
		Label[] las=new Label[] {
				new Label("�й�"),
				new Label("�̸�"),
				new Label("����"),
				new Label("����"),
				new Label("����")
		};
		for(int i=0; i<adds.length; i++) {
			adds[i]=new TextField(3);
			top.add(las[i]);
			top.add(adds[i]);
		}
		Button addBtn=new Button("�Է�");
		addBtn.addActionListener(new Ex13());
		top.add(addBtn);
		
		
		f.add(top,BorderLayout.NORTH);
		f.add(center,BorderLayout.CENTER);
		f.setBounds(-3840,50,550,700);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String[] row=new String[] {
				adds[0].getText(),
				adds[1].getText(),
				adds[2].getText(),
				adds[3].getText(),
				adds[4].getText()
		};
		data.add(row);
		centerValid();
		////////////////////////////
//		TextField[] col=new TextField[5];
//		col[0]=new TextField(adds[0].getText(),5);
//		col[1]=new TextField(adds[1].getText(),5);
//		col[2]=new TextField(adds[2].getText(),5);
//		col[3]=new TextField(adds[3].getText(),5);
//		col[4]=new TextField(adds[4].getText(),5);
//		
//		Panel row=new Panel();
//		for(int i=0; i<col.length; i++) {
//			row.add(col[i]);
//		}
//		Button edit=new Button("����");
//		Button del=new Button("����");
//		row.add(edit);
//		row.add(del);
//		center.add(row);
//		for(int i=0; i<adds.length; i++) {
//			adds[i].setText("");
//		}
//		f.validate();
	}
	void centerValid() {
		center.removeAll();
		Panel group1=new Panel();
		group1.add(new Label("�й� "));
		group1.add(new Label("�̸�              "));
		group1.add(new Label("���� "));
		group1.add(new Label("���� "));
		group1.add(new Label("���� "));
		group1.add(new Label("����  "));
		group1.add(new Label("����"));
		center.add(group1);
		
		for(int i=0; i<data.size(); i++) {
			String[] row=data.get(i);
			Panel group=new Panel();
			group.add(new TextField(row[0]));
			group.add(new TextField(row[1],10));
			group.add(new TextField(row[2]));
			group.add(new TextField(row[3]));
			group.add(new TextField(row[4]));
			Button btn1=new Button("����");
			group.add(btn1);
			Button btn2=new Button("����");
			group.add(btn2);
			center.add(group);
		}
		for(int i=0; i<adds.length; i++)
			adds[i].setText("");
		f.validate();
	}

}






