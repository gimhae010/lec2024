package com.bbs.model;

import java.sql.Timestamp;

// javaBean class
public class BbsBean {
	private int num;
	private String sub,id,content;
	private Timestamp nalja;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getNalja() {
		return nalja;
	}
	public void setNalja(Timestamp nalja) {
		this.nalja = nalja;
	}
	
	@Override
	public String toString() {
		return "BbsBean [num=" + num + ", sub=" + sub + ", id=" + id + ", content=" + content + ", nalja=" + nalja
				+ "]";
	}
	
}
