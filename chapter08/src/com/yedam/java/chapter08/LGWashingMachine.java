package com.yedam.java.chapter08;

public class LGWashingMachine implements WashingMachine {
	
	
	
	
	@Override
	public void startBtn() {
		// TODO Auto-generated method stub
		System.out.println("세탁기가 빨래를 시작");
	}

	@Override
	public void pauseBtn() {
		// TODO Auto-generated method stub
		System.out.println("세탁기가 빨래를 일시중지");
		
	}

	@Override
	public void stopBtn() {
		System.out.println("세탁기가 빨래를 중지");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int changeSpeed(int speed) {
		// TODO Auto-generated method stub
		switch(speed) {
		case 1:
			return 20;
		case 2:
			return 50;
		case 3:
			return 100;
		}
		return 0;
	}

	
	
}
