package com.gimhae;

class Box3{
	
	public static <T>T func01(T pen) {
		Box<T> box=new Box<T>();
		box.setPen(pen);
		return box.getPen();
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Pencil pen;
		pen= Box3.<Pencil>func01(new Pencil());
		pen.drow();
	}

}
