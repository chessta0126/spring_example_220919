package com.example.lesson01;

// 그냥 클래스이므로 Spring bean 필요 없음
public class Data {
	// 필드
	private int id;
	private String name;
	
	// getter, setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
