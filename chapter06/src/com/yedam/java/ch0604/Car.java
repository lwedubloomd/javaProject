package com.yedam.java.ch0604;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas == 0) {		//this.gas == 0) { 해도 무방
			System.out.println("gas가 없슴니다");
			return false;  //얘가 존재하기 땜에 중단되고 뒤에꺼가 실행되지 않을 것,,,
			
		}
		System.out.println("gas가 있습니다");
		return true; //if로 묶지않은 이유는 if로 묶게 되면은 중단이에요,, 첫줄에 return잇으면은,, 머 중단되니
		//둘을 굳이 else if 로 묶을 필요가 없당
	}
	void run() {
		while(true) {
			if(this.gas > 0) {
				System.out.println("달립니다. (gas 잔량 : "+ this.gas +")");
				this.gas--;
			}else {
				System.out.println("멈춥니다. (gas 잔량 :" + this.gas +")");
				return;
			}
		}
	}
}	
