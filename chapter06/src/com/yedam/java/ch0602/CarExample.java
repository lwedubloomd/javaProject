package com.yedam.java.ch0602;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스에 직접 접근하는거는 웬만하면 없
		Car myCar = new Car();
		
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : "+ myCar.company);	//myCar. 하면 나오는 정보 다 활용할 수 있다
												//목록 뒤에 타입형이 다 나와있음
												//object 어쩌구 있는거는 걔랑 상속관계에 있다능 말
		System.out.println("색깔 : "+ myCar.color);
		System.out.println("최고속도 : "+myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도 : "+ myCar.speed);

		Car newCar = new Car();				//값을 초기화하는 것과 같다
		System.out.println("새로운 차의 현재 속도 : " + newCar.speed);
		
		String str = new String("Con");
	}

}
