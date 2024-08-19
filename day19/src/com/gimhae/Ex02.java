package com.gimhae;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		java.net.URL url=null;
		try {
//			String path="https://www.google.com/search?q=java&sca_esv=6477522ffadbc903&sca_upv=1&source=hp&ei=dp7CZpaXIpOB1e8Pzpvf2Qc&iflsig=AL9hbdgAAAAAZsKshvqFOAVa3Yx9-P4v_Es6mtjxMk6Y&ved=0ahUKEwiWqtKz8v-HAxWTQPUHHc7NN3sQ4dUDCA8&uact=5&oq=java&gs_lp=Egdnd3Mtd2l6IgRqYXZhMggQABiABBixAzIKEAAYgAQYQxiKBTILEAAYgAQYsQMYgwEyCBAAGIAEGLEDMgUQABiABDIFEAAYgAQyCBAAGIAEGLEDMggQABiABBixAzIIEAAYgAQYsQMyBRAAGIAESIkEUABYgAJwAHgAkAEAmAFmoAGFA6oBAzIuMrgBA8gBAPgBAZgCBKACoAPCAhEQLhiABBixAxjRAxiDARjHAcICBRAuGIAEwgIOEC4YgAQYsQMY0QMYxwHCAgsQLhiABBixAxiDAcICBBAAGAOYAwCSBwMyLjKgB-kY&sclient=gws-wiz";
			String path="https://getbootstrap.com/docs/3.4/components/#navbar";
			url=new URL(path);
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getFile());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getRef());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
