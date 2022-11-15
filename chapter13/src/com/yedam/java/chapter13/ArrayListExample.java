package com.yedam.java.chapter13;

import java.util.ArrayList;
import java.util.List;		//util

public class ArrayListExample {
	public static void main(String[] args) {

		//<> ▽▽▽▽▽해당 인덱스 아래 어떤 타입을 넣을 것인가..
		List<String> list = new ArrayList<String>();
		
		
		//E?
		//어떤 데이터를 넣을 지 모를 때나 여러가지 데이터 넣으 ㄹ때
		//어떤 객체든지 다 허용해쥼~ Element 어쩌구 ~ 		
		//List<E> list2 = new ArrayList<>();
	
		
		//객체 저장
		//배열 list[0] = "Java";
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"DateBase");//인덱스가 2인 애한테 "DateBase"이걸 주겟음//원래 잇던 애 밀려남ㅋ
		list.add("iBATIS");
		
		//배열 list.length()
		int size = list.size();
		System.out.println("총 객체수 :"+ size);
		System.out.println();
		
		//String skill = list.get(2);
		String skill = list.get(2);//세번째꺼 가져오는거임
		System.out.println("2:" + skill +"\n");
		
		
		System.out.println("----------------------------------------");
		for(int i = 0; i<list.size(); i ++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println();
		
		
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i = 0; i<list.size(); i ++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}
}
