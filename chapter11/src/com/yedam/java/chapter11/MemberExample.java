package com.yedam.java.chapter11;

import java.util.HashMap;

public class MemberExample {

	public static void main(String[] args) {
		//객체 동등 비교 조건 = 값이 같다 or 다르다
		//강제 타입 변환
		//Object -> 여러 클래스
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {		//equals가 먼데...?//객체 같은지 아닌지 어쩌구 비교하는 그렁거임....
										//강제 타입 변환...? //equals는 같다는 의미임,,,, (==)이렁건데 스트링에서 쓰이는거~
										//객체가 가지고 있는 데이터값 비교
			
			System.out.println("obj1와 obj2는 동등");
		} else {
			System.out.println("obj1와 obj2는 다름");
		}
		if (obj1.equals(obj3)) {
			System.out.println("obj1와 obj3는 동등");
		} else {
			System.out.println("obj1와 obj3는 다름");
		}
	
		
		HashMap<Member, String> member = new HashMap<>();
		
		//new Member("1") -> 주소가 "1"의 10이고, 해쉬코드 1
		member.put(new Member("1"), "홍길동");//☆☆
		
		//new Member("1") -> 주소가 "1"의 10이고, 해쉬코드 1
		String value = member.get(new Member("1"));//☆☆ 두개가 같이 인식된다
		System.out.println(value);
	
	}
}
