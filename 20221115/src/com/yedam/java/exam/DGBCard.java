package com.yedam.java.exam;

public class DGBCard extends Card{

	final String DGCompany = "대구은행";
	String DGCardStaff;
	
	public DGBCard(String cardNo, int validDate, int cvc) {
		super(cardNo, validDate, cvc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showCardInfo() {
		// TODO Auto-generated method stub
		super.showCardInfo();
		System.out.println("담당직원 - "+ DGCardStaff+","+DGCompany);
		
	}

	
	
}
