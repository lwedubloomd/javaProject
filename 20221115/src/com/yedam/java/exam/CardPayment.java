package com.yedam.java.exam;

public class CardPayment implements Payment{
	
	
	double cardRatio;
	
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	@Override
	public int online(int price) {
		// TODO Auto-generated method stub
		
		double a = cardRatio+((double)ONLINE_PAYMENT_RATIO/100);
		return (int)(price - price*a);
	}

	@Override
	public int offline(int price) {
		// TODO Auto-generated method stub
		double a = cardRatio +((double)OFFLINE_PAYMENT_RATIO/100);
		return (int)(price - price*a);
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("*** 카드로 결제 시 할인 정보");
		System.out.println("온라인 결제시 총 할인율 : " +(cardRatio+((double)ONLINE_PAYMENT_RATIO/100)));
		System.out.println("오프라인 결제시 총 할인율 : " +(cardRatio +((double)OFFLINE_PAYMENT_RATIO/100)));
	}
	
	
}
