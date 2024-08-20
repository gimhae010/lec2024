package com.gimhae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class Ex02 {

	public static void main(String[] args) {
		String msg="https://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnld=159";
		URL url=null;
		URLConnection conn=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			url=new URL(msg);
			conn=url.openConnection();
			is=conn.getInputStream();
			isr=new InputStreamReader(is,"UTF-8");
			br=new BufferedReader(isr);
			String result="";
			while((msg=br.readLine())!=null) {
				result+=msg+"\n";
			}
			
			result=result.replaceAll("\t", "");
			result=result.replaceAll("  ", " ");
			result=result.replaceAll("<[^>]*>", "");
			String[] arr=result.split("\n");
			System.out.println(arr[19]);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
