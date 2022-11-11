package com.yedam.java.chapter0701;

public class Application {

	public static void main(String[] args) {

		Child child = new Child();
		child.lastName = "paul";
		child.age = 20;

		// 부모 클래스 필드
		System.out.println(child.firstName + child.lastName);
		
		
		//System.out.println(child.job);			//private 로 바꾸느 오류뚬

		// 부모 -> 여러명의 자식
		// 자식 -> 여러명의 부모X 하나의 부모만 가넝~

		DmbCellPhone dmb = new DmbCellPhone("고아라폰", "화이트", 10);

		System.out.println("모델 :" + dmb.model);
		System.out.println("색상 :" + dmb.color);

		// 자식 클래스 필드 사용
		System.out.println("채널 :" + dmb.channel);

		// 부모 클래스 메소드 사용
		dmb.powerOn();
		dmb.sendVoice("안녕하세요");
		dmb.receiveVoice("안녕하세요 저는 김또치 입니다");
		dmb.powerOff();

		// 자식 클래스 메소드 사용
		dmb.turnOnDmb();
		
		Member member = new Member("고길동","123456-465",1);
		
		System.out.println("name :"+member.name);
		System.out.println("ssn :"+member.ssn);
		System.out.println("memberNo :"+member.stdNo);
		
		
		System.out.println("-----------------------------------------");
		
		Child cd = new Child();
		
		cd.method1();
		cd.method2();
		cd.method3();
		
		System.out.println("-----------------------------------------");
		
		Compute com = new Compute();
		com.areaCircle(10);
		
		double result = com.areaCircle(10);		//값까지 같이 출력하는 방법
		System.out.println("result :"+result);
		
		System.out.println("-----------------------------------------");
		
		SupersonicAirPlane sa = new SupersonicAirPlane();
		
		sa.takeOff();	//부모 Airplane
		
		sa.fly();	//부모 Airplane
		
		System.out.println("--------");
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;	//자식 불러오는 것
		
		sa.fly();	//자식 Super~어쩌구
		
		System.out.println("---------");
		sa.flyMode = SupersonicAirPlane.NORMAL;	//부모 불러오는 것
		
		sa.fly();	//부모 Airplane
		
		sa.land();	//부모 Airplane
		System.out.println("-----------------------------------------");
		
		Child chd = new Child();//method 1,3 정의 돼 있음
		Parents parent = chd;//method 1,2 정의 돼 있음
		//Parents parent = new Child();와 같음
		//자동 타입 변환
		//부모 클래스에 있는 필드, 메소드를 사용을 하되
		//만약 자식 클래스에 오버라이딩이 돼 있는 메소드가 조재 한다면
		//부모 클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 있는 메소드
		
		parent.method1();	//출력하면 child클래스의 것이 나오는데 override해서 글타...
		parent.method2();
		//parent.method3();	//자식 입장이면 method1,2,3 전부 다 호출 가능하지만 parent타입이면은 3은 불가
							//부모타입의 것만 사용 가넝~
		chd.method1();
		chd.method2();
		chd.method3();
		
	}
}
