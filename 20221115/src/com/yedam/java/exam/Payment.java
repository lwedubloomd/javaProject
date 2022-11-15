package com.yedam.java.exam;

public interface Payment {

	
	public int ONLINE_PAYMENT_RATIO = 5;
	public int OFFLINE_PAYMENT_RATIO = 3;
	
	
	public int online(int price);
	public int offline(int price);
	public void showInfo();
	
}
