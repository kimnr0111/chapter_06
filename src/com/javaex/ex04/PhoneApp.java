package com.javaex.ex04;

public class PhoneApp {
	
	private String name;
	private String hp;
	private String company;
	
	public PhoneApp(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public void showInfo() {
		System.out.println("이름:" + name + ", 휴대폰:" + hp + ", 회사:" + company);
	}
	
	public String Info() {
		String info = name + "," + hp + "," + company;
		return info;
	}
	

}
