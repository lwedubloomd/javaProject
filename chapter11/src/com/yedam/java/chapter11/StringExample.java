package com.yedam.java.chapter11;

import java.io.UnsupportedEncodingException;

public class StringExample {

	// String에 대하여

	// String a = "1";
	// String c = "1";
	// String b = new String("1");//new연산자 사용하면 가져와서 하게 되면은 다른 주소를 가져옴..new는 다른 주소를
	// 할당받는ㄷ

	// 바이트 -> 문자열
	public static void main(String[] args) {

		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		// 배열 전체를 STring 객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4); // (해당 배열, 시작점, 갯수)
		System.out.println(str2);

		// String 메소드
		
		// 1) charAt(int index) - 특정 문자 위치를 반환

		String ssn = "123456-1894561";
		char sex = ssn.charAt(7);

		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}

		// 문자열 비교
		// equals()
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		String strVar3 = "자바";
		// 주소를 비교
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체 참조");
		} else {
			System.out.println("다른 String 객체 참조");
		}

		if (strVar1.equals(strVar3)) {
			System.out.println("같은 문자열 가짐");
		} else {
			System.out.println("다른 문자열 가짐");
		}

		byte[] bytes2 = null;
		String str = "안녕하세요";
		// △한글자씩 쪼개는 걸 할거에여... =>바이트 배열로 변환
		bytes2 = str.getBytes();

		System.out.println(bytes2.length);// =>EUC-KR로 하면 2바이트인데 utf-8이라 한글 한글자에 3byte함

		String str3 = new String(bytes2);
		System.out.println("bytes2 -> String" + str3);

		try {
			byte[] bytes3 = str.getBytes("EUC-KR");
			System.out.println("bytes3.length :" + bytes3.length);
			String str4 = new String(bytes3, "EUC-KR");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// 문자열 찾기 //문자 찾기, 문자열 찾기 구분하세용~
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("프로그래밍");
		System.out.println(index);

		index = subject.indexOf("a");
		System.out.println(index);// 자바 프로그래밍 안에 a 없어서 출력값 -1로 나옴

		// 문자열의 문자 갯수 얻기
		System.out.println(subject.length());

		// 문자열 변경
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(newStr);
		// 결과=>Java 프로그래밍
		// 바뀐걸로 보이지만 바뀐게 아니라 각각 모두 등록되어 있고 참조하는 스탈이 다르당..??
		// 따로 메모리 만들어서 따로 저장된거임
		// 아에 바꿔버리는 방법도 잇움▽▽▽책에는 없음
		// StringBuilder 또는 buffer(임시저장소라는 뜻)

		// oldStr = "자바";//100번지
		// oldStr += "프로그래밍";//200번지
		// oldStr += "재밌다";//300번지

		StringBuilder sb = new StringBuilder();

		StringBuffer sb2 = new StringBuffer();
		sb2.append(sb2);

		System.out.println(sb2);

		System.out.println("----------------------");
		sb.append("자바");// 500
		sb.append("프로그래밍");// 500
		sb.append(123);// 500

		System.out.println(sb);

		// 대소문자 바꾸기
		String strVal = "asdfas";
		String strVa2 = "ASDFASDF";

		System.out.println(strVal.toUpperCase());
		System.out.println(strVal.toLowerCase());

		// trim 공백 지우기!
		String strTrim = "    자바    ";
		System.out.println(strTrim);
		System.out.println(strTrim.trim());

		// substring()
		// substring(index, end)
		// substring(index)
		// index부터 끝까지 짜르세요

		String ssn2 = "880888-1234567";

		String firstnum = ssn2.substring(0, 6);
		String secondnum = ssn2.substring(7);

		System.out.println(firstnum);
		System.out.println(secondnum);

		// split()
		String strSplit = "1-1-1-1-1-1-5-7-8-";
		String[] strAry = strSplit.split("-");
		for (String temp : strAry) { // 향상된 for문...?
			System.out.println(temp);
		}
		
		//문자열 변환
		//숫자나, 소수, 불리언 -> String으로 변환
		String strChng = String.valueOf(false);
		String strChng2 = String.valueOf(10);
		String strChng3 = String.valueOf(10.7);
		
		System.out.println(strChng);
		System.out.println(strChng2);
		System.out.println(strChng3);
	}
}
