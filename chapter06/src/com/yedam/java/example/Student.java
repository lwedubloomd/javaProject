package com.yedam.java.example;

public class Student {
	//필드
	private String sName;
	private String sNo;
	private int kor;
	private int mat;
	private int	eng;
	
	//생성자
	
	
	//메소드
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsNo() {
		return sNo;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int ent) {
		this.eng = ent;
	}
	
	
	//학교이름 학번 국어 수학 영어
	void getInfo(){
		System.out.println("-----------------------------------------------------");
		System.out.printf("학교이름 : %s\n \t학번 : %s\n \t국어성적 : %d\n \t수학성적 : %d\n \t영어성적 : %d\n",sName,sNo,kor,mat,eng);
		
	}

}
