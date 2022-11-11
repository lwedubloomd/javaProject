package com.yedam.java.chapter0701;

public class Member extends People {		//부모Class에 생성자 없으면은 자식 Class 붙여줄 때 오류남.

	
	public int stdNo;
	
	
	public Member(String name, String ssn,int stdNo) {
		super(name, ssn);
		this.stdNo = stdNo;
	}
}
