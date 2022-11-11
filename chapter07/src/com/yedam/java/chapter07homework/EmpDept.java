package com.yedam.java.chapter07homework;

public class EmpDept extends Employee {
	
	
	//필드
	String department;
	
	//생성자
	
	
	
	
	
	
	
	public EmpDept(String department) {
		this.department = department;
	}


	public String getDepartment() {
		return department;
	}
	
	//메소드
	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		super.getInformation();
		System.out.println("부서 :"+department);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("수퍼클래스\n서브클래스");

}
	}
