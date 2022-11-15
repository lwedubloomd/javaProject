package com.yedam.java.chapter13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);// 위에꺼 홍길동 덮어써짐

		System.out.println("총 Entry 수 : " + map.size());

		int score = map.get("홍길동");// 알아서 타입 변환 된다
		System.out.println("\t홍길동" + score);
		System.out.println();

		// 모든 key값 가져오기
		Set<String> keySet = map.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		while (keyInterator.hasNext()) {
			String key = keyInterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}

		// 객체 삭제
		map.remove("홍길동");
		System.out.println(map.size());

		// 모든 k,v()Map.entry) 가져와서 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// while문이랑 같은거임~ 향상된 for문 형태
		for (Map.Entry<String, Integer> temp : map.entrySet()) {
			String key = temp.getKey();
			Integer value = temp.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//지우는 것~~~~
		map.clear();
		
		System.out.println("총 Entry 수 : " + map.size());
	}
}
