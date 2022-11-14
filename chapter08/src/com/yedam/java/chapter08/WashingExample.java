package com.yedam.java.chapter08;

public class WashingExample {
	public static void main(String[] args) {
		//▽▽밑에 만들어준 method
		washing(new LGWashingMachine());
		washing(new SamsungWashingMachine());
		
		
		//WashingMachine wm = new LGWashingMachine();▲▲이거 쓸려고 이거 지움...?
		// 머 일케 쓰는게 다형성 어쩌구당
	}

	public static void washing(WashingMachine wm) {

		wm.startBtn();
		System.out.println(wm.changeSpeed(3));
		wm.stopBtn();

}	
}

