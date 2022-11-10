package com.yedam.java.ch0601;

public class Person {

	
	final String nation = "Korea";		//고정시킨는 것,,
	final String ssn;		//ssn 미국 주민번호가틍거~
	String name;
	
	public Person(String ssn, String name) {
		this.ssn  = ssn;
		this.name = name;		//name은 바꿀 수 잇기땜에 필드에서 final로 안돗음~~
		
	}

}
