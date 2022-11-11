package com.yedam.java.chapter0701;

public class People extends Student{  //extends Student 하면 오류나는데 그거슨 Student를 
										//final class로 만들엇기땜에

	
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
