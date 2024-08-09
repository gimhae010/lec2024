package com.gimhae;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Ex23 {

	public static void main(String[] args) {
		try(
			InputStream is=new FileInputStream(Ex22.f);	
			ObjectInputStream ois=new ObjectInputStream(is);
				){
			Lotto ball=(Lotto) ois.readObject();
			ball.show();
//			String msg=(String) ois.readObject();
//			int[] arr1=(int[]) ois.readObject();
//			List<Double> arr2=(List<Double>) ois.readObject();
//			Set<Double> arr3=(Set<Double>) ois.readObject();
//			
//			System.out.println(msg);
//			System.out.println(Arrays.toString(arr1));
//			System.out.println(arr2);
//			System.out.println(arr3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
