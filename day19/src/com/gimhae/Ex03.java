package com.gimhae;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

public class Ex03 {

	public static void main(String[] args) {
		java.net.URLConnection conn=null;
		java.net.URL url=null;
//		String spec="https://google.com";
//		String spec="https://www.7-zip.org/a/7z2408-x64.exe";
//		String spec="https://daum.net";
		String spec="https://www.weather.go.kr/w/index.do#dong/4825059000/35.2493126351167/128.901884444854/%EA%B2%BD%EB%82%A8%20%EA%B9%80%ED%95%B4%EC%8B%9C%20%EC%96%B4%EB%B0%A9%EB%8F%99/SCH/%EC%9D%B8%EC%A0%9C%EB%8C%80%ED%95%99%EA%B5%90%20%EC%9E%A5%EC%98%81%EC%8B%A4%EA%B4%80";
//		File f=new File("daum.html");
		java.io.InputStream is=null;
//		OutputStream os=null;
		InputStreamReader isr=null;
//		BufferedInputStream bis=null;
//		BufferedOutputStream bos=null;
		try {
			url=new URL(spec);
			conn=url.openConnection();// 서버에 접속
			is=conn.getInputStream();
//			os=new FileOutputStream(f);
//			while(true) {
//				int su=is.read();
//				if(su==-1)break;
//				os.write(su);
//			}
//			bis=new BufferedInputStream(is);
//			bos=new BufferedOutputStream(os);
//			byte[] buf=new byte[512];
//			while(true) {
//				int su=bis.read(buf);
//				if(su==-1)break;
//				os.write(buf,0,su);
//			}
			isr=new InputStreamReader(is,"UTF-8");
			String msg="";
			while(true) {
				int su=isr.read();
				if(su==-1)break;
				msg+=((char)su);
			}
			System.out.println("다운로드 완료");
			int beginIdx=msg.indexOf("시간별 예보");
			int endIdx=msg.indexOf("<!-- 누리집 안내지도 -->");
			msg=msg.substring(beginIdx,endIdx);
			msg=msg.replaceAll("<[^>]*>", "");
			msg=msg.replaceAll("  ", "");
			msg=msg.replaceAll("\t", "");
			msg=msg.replaceAll("\n\n", "\n");
			System.out.println(msg);
//			bos.close();
//			bis.close();
//			os.close();
			isr.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
