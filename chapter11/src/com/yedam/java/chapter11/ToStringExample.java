package com.yedam.java.chapter11;

import java.util.Date;//util이거 잘보셈~

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj = new Object();
		
		System.out.println(obj.toString());//주소값?
		
		Date obj2 = new Date();
		
		System.out.println(obj2.toString());
	}

}
