package com.yedam.java.ch0601;

public class Student {
	// 필드
	// 학생이름 학교이름 학번 /국어 영어 수학 성적
	String stuName;
	String schName;
	int stuCode;
	int korScore;
	int engScore;
	int matScore;

	// 생성자
	// 생성자 통해서 모든 데이터를 입력 //
	public Student(String stuName, String schName, int stuCode, int korScore, int engScore, int matScore) {
		this.stuName = stuName; // 필드를 사용하기 위해 this를 사용하는 것이다.
		this.schName = schName;
		this.stuCode = stuCode;
		this.korScore = korScore;
		this.engScore = engScore;
		this.matScore = matScore;
	}

	// 메소드
	// getInfo() 학생의 내용을 출력할 수 있는 기능
	public void getInfo() {
		System.out.printf("학생이름 %s\n 학교이름 %s \n 학번%d \n"
				+ "국어성적:%d,영어성적:%d,수학성적:%d  ",stuName,schName,stuCode,korScore,engScore,matScore);
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getSchName() {
		return schName;
	}

	public void setSchName(String schName) {
		this.schName = schName;
	}

	public int getStuCode() {
		return stuCode;
	}

	public void setStuCode(int stuCode) {
		this.stuCode = stuCode;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMatScore() {
		return matScore;
	}

	public void setMatScore(int matScore) {
		this.matScore = matScore;
	}
}
