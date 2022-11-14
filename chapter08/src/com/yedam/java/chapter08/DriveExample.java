package com.yedam.java.chapter08;

public class DriveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		System.out.println("--------------------");
		Vehicle vhc = new Bus();		//☆☆
		
		vhc.run();
		//vhc.checkFare();//이거하면 오류나는데 checkFare()은 오버라이딩이 안도ㅐ..		 
		//※!checkFare()은버스 내부의 method임
		
		//그래서 이거 강제 타입변환 할거임
		//↓↓↓↓↓↓↓↓↓↓↓↓↓
		Bus bus2 = (Bus)vhc; //버스로 된 구현객체를 만들고,		//☆☆

		bus2.run();
		bus2.checkFare();
		
		/*	Bus bus3 = new Bus();
			bus3.checkFare();  //result 승차요금을 확인합니다 나옴
		*/
	}

}
