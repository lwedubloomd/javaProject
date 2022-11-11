package com.yedam.java.chapter0702;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car = new Car();
		
		for(int i = 1; i<=5; i++) {
			int problemTire = car.run();
			
			switch (problemTire) {
			case 0:
				System.out.println("4짝이 멀쩡");
				break;
			case 1:
				System.out.println("앞왼쪽 HankTire 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른 kumhoTire 교체");
				car.frontRightTire = new HankookTire("앞오른",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankTire 교체");
				car.backLeftTire = new HankookTire("뒤왼",14);
				break;
			case 4:
				System.out.println("뒤오른 kumhoTire교체");
				car.backRightTire = new HankookTire("뒤오른",17);
				break;
			case 5:
				break;
			case 6:
				break;
			}
			System.out.println("###################");
		}
	}

}
