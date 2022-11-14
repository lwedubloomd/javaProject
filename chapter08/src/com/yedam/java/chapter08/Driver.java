package com.yedam.java.chapter08;

public class Driver {

	
	public void drive(Vehicle vehicle) {
		//추가햇음
		if(vehicle instanceof Bus) {	// 참조가 됏다 엄다 이런거 if?????????????????????????먼말이고..........
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		//여기까지 추가했음 
		vehicle.run();
		
	}
}
