package com.yedam.java.ch0402;

public class ConditinoalStatementExample {

	public static void main(String[] args) {
		// for 문

		// 1qnxj 10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

//		int y = 1;
//		for(;;) {
//			System.out.println("루프반복"); //for문 무한으로 돌리는 방법
//		}

		int x = 1;
		for (; x <= 100; x = x + 15) {
			System.out.println("출력");
		}
		System.out.println("x : " + x);

		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--)
			;

		// i~100까지 출력, 동시에 1~100까지 합을 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) { // i=1 i는 1 부터
			System.out.println(i);
			sum = sum + i; // sum += i
		}
		System.out.println("1~100까지의 합계 :" + sum);

		// float 타입 카우터 변수
		for (float f = 0.1f; f <= 1.0f; f += 0.1f) {
			System.out.println(f);
		}

		// 구구단
		// for(int i=2,j=1; i<=9, j<=9; i++,j++) {
		// System.out.println(i*j); //내가 ~한 것 틀렷움~~
		for (int i = 0; i <= 9; i++) {
			System.out.println("***" + i + "단 ***");
			for (int j = 0; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}
		// while

		// 1~10까지 출력
		int count = 1;// ㅇㅒ를 내부에 넣는다면 실행이 안될것~~~
		while (count <= 10) {
			System.out.println(count);
			count++;
			// if(count > 10) break;
		}
		count = 0;// ㅇㅒ를 내부에 넣는다면 실행이 안될것~~~
		while (count <= 9) {
			count++;
			System.out.println(count);
		}

		// 1~100까지 출력, 1부터 100까지 합을 출력

		sum = 0;
		count = 0;
		while (count <= 100) {
			System.out.println(count);
			sum += count;
			count++;
		}
		System.out.println("1~" + (count - 1) + "까지 합 :" + sum);

	

	// 주사위 두개를 굴리는데 합이 3일 경우에만 스탑
	int index = 1;
	while(index!=1){
		System.out.println("while 반복문이 " + index + "번 실행~");
	}
	
	do{
		System.out.println("do~while 반복문이"+ index +"번 실행~");
	}while(index !=1);
	
	//break로 while문 종료
	while(true) {
	int num = (int)(Math.random()*6) + 1;
	System.out.println(num);
	if(num == 6)
		break;
		}
	System.out.println("-------------------------------");
	// 이중 for문에서 break문 사용          //char 실제로 가지고 잇는 값이 정수라 for문 가넝~
	outter:for(char upper='A'; upper <= 'Z'; upper++) {
		
		for(char lower = 'a'; lower <= 'z'; lower++) {
			System.out.println(upper + "-" + lower);
			if(lower == 'g') {
			
		/*
		 * break outter;//머 이름을 걸고 바깥쪽 어쩌구를 break 스탑시키겓다.,,,
		 * 
		 * for(char upper='A'; upper <= 'Z'; upper++) { boolean upper = false for(char
		 * lower = 'a'; lower <= 'z'; lower++) { System.out.println(upper + "-" +
		 * lower); if(lower == 'g') {
		 * 
		 * break true;//머 이름을 걸고 바깥쪽 어쩌구를 break 스탑시키겓다.,,,
		 */
			}
		}
		
		System.out.println("1)안쪽 for문 종료");
	}
	System.out.println("2)밖 for문 종료");
	
	//continue를 사용한 for문
	for(int i =1; i<=10; i++) {
		if(i%2 ==0) continue;
		System.out.println(i);
			
		}
	}
}