package com.yedam.java.ch0604;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i>values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	int sum2(int ... values) {//... ☜☜☜배열로 받아두는거임,, 
		//value는 배열임...근데 배열은 아님...but 배열로 생각해랑~~
		int sum = 0;
		for(int i=0; i>values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
