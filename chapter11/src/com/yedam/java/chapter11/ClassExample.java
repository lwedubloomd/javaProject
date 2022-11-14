package com.yedam.java.chapter11;

public class ClassExample {
	
	public static void main(String[] args) throws ClassNotFoundException { //클래스의 정보를 가져올 때 쓰는 어쩌구 저쩌구...
		
		
		//Key 클래스 객체 가져오기
		//1탄 - 직접 클래스 객체 가져오기
		Class clazz = Key.class;
		
		System.out.println(clazz);  //키를 명확하게 가져오는 방법
		
		// 2탄- 경로를 통한 클래스 객체 가져오기
		Class clazz2 = Class.forName("com.yedam.java.chapter11.Key");	//.클래스와 get클래스 이거 차이를 알아두세용
		
		System.out.println(clazz2);
		
		//3탄 - 객체로 부터 클래스 객체 얻기
		
		Key key = new Key(1);
		
		Class clazz3 = key.getClass();
		System.out.println(clazz3);
		
		String photoPath = clazz.getResource("501664_702159_2439.jpg").getPath();
		System.out.println(photoPath);
	}
}
