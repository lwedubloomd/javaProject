package com.yedam.java.ch0601;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone iphone14Pro = new SmartPhone();//기능만 있고 정보를 넣어야해
												//new연산자를 해야
		
		iphone14Pro.maker = "Apple";		//String타입으로 정해놔서 string타입으로 입력해줭햐ㅐ 
		iphone14Pro.name = "iphone14Pro";
		iphone14Pro.price =1000000;
		
		System.out.println("나의 핸드폰은 "+ iphone14Pro.maker +" 입니다.");
		System.out.println("나의 핸드폰 기종은 "+iphone14Pro.name+" 입니다");
		
		iphone14Pro.call();
		iphone14Pro.hangUp();
		
		SmartPhone zflip4 = new SmartPhone();	//생성자 안만들어도 java실행할 때 
												//java에서 자동으로 만들어준다
												//매개변수 만들어주고 생성자 만들어준다면 이거슨 쓸 수 없음
												//매개변수 만들고 그라면 java에서 만들어 줬떤 
												//기본 생성자는 없어진당!
		
		System.out.println("객체 생성시 생성자에 초기값을 안넣어중 경우");
		System.out.println(zflip4.name);  //result => null
		
		zflip4.name = "zfilp4";
		zflip4.maker = "samsung";
		zflip4.price = 900000;
		
		zflip4.call();
		zflip4.hangUp();
		/*class는 참조타입 배열또한 참조타입이다. String도 참조타입이당....
		 new연산자와 생성자를 이용해서 머 어쩌구 정보가 어디에 들어가있습니다...???? */
		
		
		
		System.out.println(iphone14Pro);
		System.out.println(zflip4);
		/* ↑↑↑↑↑↑↑↑↑일케 하면 결과가
		com.yedam.java.ch0601.SmartPhone@5aaa6d82
		com.yedam.java.ch0601.SmartPhone@73a28541
		이렇게 나오는데 저거는 어디에 잇는지 주소 알려주능거임,,,,
		 @뒤에꺼는 메모리주소?이당 ㅋ */
		
		

	}

}
