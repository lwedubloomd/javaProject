package com.yedam.java.chapter11;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// hashmap이란? -> Key ,Value 데이터를 저장

		
		HashMap<Key, String> hashmap = new HashMap<>();
		//key는 클래스 타입 뒤에는 value라고 그래서 ,,,? value형태로 저장을 하고
		//열쇠를 전해주는 어쩌구 저쩌구
		
		//Hash에다가 put은 넣는다는 얘기고 key는 타입,,,? "홍길동"은 데이터
		//new Key(1) -> 1
		hashmap.put(new Key(1), "홍길동");//equal이랑 비슷하게 쓰이는데 비교하는 객체가 다르다
		
		
		//new Key(1) -> 2
		String value = hashmap.get(new Key(1)); //이거 출력하면 null나온당
												//new로 새로운 객체를 생성했기땜에 같아보여도 주소가 다룸..그래서 다르다고 나옹다...
		System.out.println(value);
	
		/* 이거 두개 주소 같음
		String a= "1";
		String b= "1";
		*/
		
		Key key = new Key(1);
		System.out.println(key.toString());//toString 정의해둔 값으로 출력된당 ㅋ
	}
}
