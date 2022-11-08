package com.yedam.java.ch0402;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1 공백3 별 1
		공백2 별2
		공백1 별3
		공백 별4*/
		
		for(int i =1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(j <= (4-i)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
