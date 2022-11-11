package com.yedam.java.chapter07homework;

public class Employee {

	
	//필드
	static String name;

	static double salary;
	
	//생성자
	public static String getName() {
		return name;
	}
	
	public static double getSalary() {
		return salary;
	}
	
	//메소드
	
	//이름과 연봉을 출력하는 기능
	public void getInformation() {
		System.out.println("이름: "+name +" 연봉:"+salary);
	}
	
	//"수퍼클래스"란 문구를 출력하는 기능
	public void print() {
		System.out.println("수퍼클래스");
	}
}
