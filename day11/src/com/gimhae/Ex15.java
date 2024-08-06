package com.gimhae;

import java.util.HashMap;
import java.util.Map;

public class Ex15 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		// key, value
		// key -set
		// val -list
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		map.put(null, null);
		map.replace("key2", "val33");
		map.remove("key2","val33");
		
		System.out.println(map.get("key1"));
		System.out.println(map.get("key2"));
		System.out.println(map.get("key3"));
		System.out.println(map.get(null));
		System.out.println(map.get("key4"));
	}
}
