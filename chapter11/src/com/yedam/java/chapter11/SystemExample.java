package com.yedam.java.chapter11;

public class SystemExample {
	public static void main(String[] args) {

//		//System.exit()
//		for(int i = 0; i<10; i++) {
//			System.out.println(i);
//			if(i == 5) {
//				System.exit(0);//웬만하면 쓰지마세영.ㅋ 비추비추,,,강제종료...인디 쓸 경우가 잘 없윰,,,시스템 건들기땜에 위험~
//			}
//		}
//		System.out.println("프로그램 종료 되지 않앗음늬당?");
	
	//현재 시각 읽기
		
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=100000; i++) { //저 10만은 딜레이 위해서 넣어준 숫자
			sum += 1;
		}
	long time2 = System.nanoTime(); //나노타임이 머고...?
	
	System.out.println("sum :"+ sum);
	System.out.println("계산 시간 :"+ (time2-time1) +"나노초가 소요됨");
	
	long time3 = System.currentTimeMillis();		//현재시간 읽어오는 거임//절대 중복되지 않는 데이터를 가져올 ㄸㅐ 쓰는 것임.
	System.out.println(time3);//1668407576132 이렁거 나왓음....이게 먼소리고..?
	}
	
	
}
