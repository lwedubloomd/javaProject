package com.yedam.exam;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int size = 0;

		int[] dice = null;	//주사위의 각 숫자별로 몇번씩 나왔는지를 기록
							//index -> 변동 (없을무)		=>주사위의 각 숫자
							//각 index별로 가지는 값 -> 변동 (있을유)
							//=> 주사위의 각 숫자가 가지는 횟수
		while (run) {
			System.out.println("===1.주사위크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료===");
			System.out.println("메뉴 > ");
			int selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) {	//주사위 크기 입력
				System.out.println("주사위 크기 >");
				size = Integer.parseInt(sc.nextLine());
				if(size >= 5 && size <=10) {
					dice = new int[size];
				}else {
					System.out.println("주사위 크기는 5~10사이만 가능합니다.");
				}

			} else if (selectNo == 2) {		//주사위 굴리기
				int count = 0; 
				while(true) {
					int num = (int)(Math.random() * size) + 1;
					count++;
					dice[num-1]=dice[num]+1;
					if(num == 5) break;
				}
			} else if (selectNo == 3) {		//결과 보기
				for(int i=0; i<dice.length; i++) {
					System.out.println((1+i) +"은"+dice[i]+"번 나왔습니다");
				}
			} else if (selectNo == 4) {		//가장 많이 나온 수
				int maxCount = 0;	//나온 횟수
				int maxIndex = 0;	//나온 수 (인덱스)
				for(int i=0; i <dice.length; i++) {
					if(maxCount < dice[i]) {
						maxCount = dice[i];
						maxIndex = i;
					}
				}
				System.out.println("가장 많이 나온 수는"+(maxIndex+1)+"입니다.");
			} else if (selectNo == 5) {		//종료
				run = false;
			

			}
		}
	}
}
