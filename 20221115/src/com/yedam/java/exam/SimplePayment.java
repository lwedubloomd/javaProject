package com.yedam.java.exam;

public class SimplePayment implements Payment{

	double simplePaymentRatio;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}
	
	@Override
	public int online(int price) {
		// TODO Auto-generated method stub
		double a = simplePaymentRatio+((double)ONLINE_PAYMENT_RATIO/100);
		return (int)(price - price*a);
	}

	@Override
	public int offline(int price) {
		// TODO Auto-generated method stub
		double a = simplePaymentRatio +((double)OFFLINE_PAYMENT_RATIO/100);
		return (int)(price - price*a);
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("*** 간편결제 시 할인 정보");
		System.out.println("온라인 결제시 총 할인율 : " +(simplePaymentRatio+((double)ONLINE_PAYMENT_RATIO/100)));
		System.out.println("오프라인 결제시 총 할인율 : " +(simplePaymentRatio +((double)OFFLINE_PAYMENT_RATIO/100)));
	}
	}

	
	

