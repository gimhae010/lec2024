package com.gimhae;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex22 {
	static File f=new File("obj.bin");

	public static void main(String[] args) {
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(
				OutputStream os=new FileOutputStream(f);
				ObjectOutputStream oos=new ObjectOutputStream(os);
				){
			oos.writeObject(new Lotto(27,"검정"));
//			String msg="한글";
//			oos.writeObject(msg);
//			int[] arr1= {1,3,5,7,9};
//			oos.writeObject(arr1);
//			List<Double> arr2=new ArrayList<>();
//			arr2.add(1.14);
//			arr2.add(3.14);
//			arr2.add(2.14);
//			arr2.add(3.14);
//			oos.writeObject(arr2);
//			Set<Double> arr3=new HashSet<>(arr2);
//			oos.writeObject(arr3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

















