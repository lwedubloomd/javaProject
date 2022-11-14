package com.yedam.java.chapter08;

public class Car {

	
	Tire frontLeftTire = new NexonTire();
	Tire frontRightTire = new NexonTire();
	Tire backLeftTire = new NexonTire();
	Tire backRightTire = new NexonTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
		
	}
}
