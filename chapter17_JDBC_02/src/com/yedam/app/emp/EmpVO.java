package com.yedam.app.emp;

import java.sql.Date;//원래 util을 쓰지만 sql써라 테이블을 갖고와서 쓰는 것이기 땜에

public class EmpVO {
	
	private int empNO;
	private String birthDate;
	private String firstName;
	private String lastName;
	private String gender;
	private String hireDate;

	
	public int getEmpNO() {
		return empNO;
	}
	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}
	
	
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	
	@Override
	public String toString() {
		return "EmpVO [empNO=" + empNO + ", birthDate=" + birthDate + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", hireDate=" + hireDate + "]";
	}
	
}
