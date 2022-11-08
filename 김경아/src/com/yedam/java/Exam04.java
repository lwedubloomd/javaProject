package com.yedam.java;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gugudan = 0;
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				gugudan = i*j;
				if(i >= j) {
				System.out.printf("%d X %d = %d\n",i,j,gugudan);
				}
			}
		}
	}

}
