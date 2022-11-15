package com.yedam.java.chapter13.map;

public class Student {

	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno + name.hashCode();
	}

}
