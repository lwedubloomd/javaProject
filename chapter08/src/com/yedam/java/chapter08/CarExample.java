package com.yedam.java.chapter08;

public class CarExample {
	public static void main(String[] args) {
	
		
		Car myCar = new Car();
		
		myCar.run();//이렇게 하게 되면은 
		
		System.out.println("#####################");
		
		myCar.frontLeftTire = new MichelinTire();
		myCar.frontRightTire = new MichelinTire();
		
		myCar.run();
}
}
