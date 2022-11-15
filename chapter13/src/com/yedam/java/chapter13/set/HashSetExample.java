package com.yedam.java.chapter13.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/Jsp");
		set.add("Java");//원래 잇기 땜에 무시됨
		set.add("iBaTIS");
		
		
		int size = set.size();
		System.out.println("총 객체 수:"+size);
		
		System.out.println();
		
		System.out.println("###반복자를 활용한 방법###");
	Iterator<String> iterator = set.iterator();//안에 객체가 비어있을 때 까지 반복되공~
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}

		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBaTIS");
		System.out.println("###향샹된 FOR문 활용###");
		for(String element : set) {
			System.out.println("\t"+ element);
		}

		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			
			System.out.println("비어있움");
		}
	}
	
}
