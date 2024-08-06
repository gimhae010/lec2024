package com.gimhae;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ex15 {

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(300,400);
		f.setLocation(-3300, 0);
		f.setVisible(true);

		CheckboxGroup grop=new CheckboxGroup();
		Checkbox box1=new Checkbox("check1",false,grop);
		Checkbox box2=new Checkbox("check2",true,grop);
		Checkbox box3=new Checkbox("check3",false,grop);
		f.add(box1);
		f.add(box2);
		f.add(box3);
	}

}
