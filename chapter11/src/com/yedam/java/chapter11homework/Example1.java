package com.yedam.java.chapter11homework;

public class Example1 {
	public static void main(String[] args) {
	
	//1)입력되는 문자 뒤집어서 출력 abc->cba	
	
		
		String abc="abc";
		
		for(int i=0; i < abc.length(); i++) {
			for(int j=1; j<=abc.length(); j++) {
			 j =abc.charAt(i);	
			 System.out.print(String.valueOf(j));
			
		}
	
		//System.out.println(String.valueOf(abc2[2])+String.valueOf(abc2[1])+String.valueOf(abc2[0]));
	
		}
		}
	}
