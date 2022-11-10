package com.yedam.java.example;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("학생 수 입력 >");
		int account = Integer.parseInt(sc.nextLine());
		Student[] stuu = new Student[account];
		
		for (int i = 0; i < stuu.length; i++) {
			Student student = new Student();
		System.out.print("학생 이름 >");
		String sName = (sc.nextLine());
		student.setsName(sName);
		//학교이름 학번 국어 수학 영어
		
		System.out.print("\t학번>");
		String sNo = (sc.nextLine());
		student.setsNo(sNo);
		
		System.out.print("\t국어 >");
		int kor = Integer.parseInt(sc.nextLine());
		student.setKor(kor);
		
		System.out.print("\t수학 >");
		int  mat = Integer.parseInt(sc.nextLine());
		student.setMat( mat);
		
		System.out.print("\t영어 >");
		int eng = Integer.parseInt(sc.nextLine());
		student.setEng(eng);

		stuu[i] = student;
	}
	for (int i = 0; i < stuu.length; i++) {
		stuu[i].getInfo();
	}
	System.out.println("-----------------------------------------------------");
	
	
	//for(int i =0; i<stuu.length;i++) {
	//	System.out.println("학생 이름>"+ stuu[i].getsName());
	//	System.out.println("학생 번호>"+ stuu[i].getsNo());
	//}
	/*↑↑↑위에 getInfo()를 일케 가져올 수도 잇다,,,
	 for (int i = 0; i < stuu.length; i++) {
	 */

	}

}
