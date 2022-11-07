package com.yedam.java.ch0501;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//null과 NullpointerException
		String str = null;
		System.out.println("길이 :" + str.length()); //이렇게 실행하면 정상적으로 실행이 안된다.
		//Null pointer access 어쩌구 내용~으로 오류 뜸 ㅋ
		
		//String 문자열 비교
		String strVar1 ="신미철";
		String strVar2 ="신미철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVal1 starVal2는 참조가 같음");
		}else if (strVar1 != strVar2) {
			System.out.println("strVal1 starVal2는 참조가 다름");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVal1 starVal2는 참조가 같음");
		}
		System.out.println("----------------------------");
		String strVar3=new String("신미철");
		String strVar4=new String("신미철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVal3 starVal4는 참조가 같음");
		}else{
			System.out.println("strVal3 starVal4는 참조가 다름");
		}
		if(strVar1.equals(strVar4)) {
			System.out.println("strVal3 starVal4는 참조가 같음");
		}
	}

}
