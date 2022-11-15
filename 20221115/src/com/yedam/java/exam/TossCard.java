package com.yedam.java.exam;

public class TossCard extends Card{

	final String toCompany = "Toss";
	String toCardStaff;
	
	
	
	public TossCard(String cardNo, int validDate, int cvc) {
		super(cardNo, validDate, cvc);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void showCardInfo() {
		// TODO Auto-generated method stub
		System.out.println("카드 정보 - Card NO,"+ cardNo );
		System.out.println("담당 직원 -"+ toCardStaff +","+ toCompany);
	}

	
	
}
