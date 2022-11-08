package com.yedam.java;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int num[] = null;
		int count = 1;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료===");
			System.out.println("메뉴>");
			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.println("주사위 크기>");
				int numboxS = Integer.parseInt(scanner.nextLine());
				if (numboxS < 5 && numboxS < 10) {
					System.out.println("범위에서 벗어났습니다");
					System.out.println("주사위 크기를 다시 정해주세요");
				}

			} else if (selectNo == 2) {

				while (true) {
					num = new int[6];
					int boxNum = (int) (Math.random() * 6) + 1;
					count++;
					num[count-1] = count;
					//num=[1의횟수,2의횟수,3의횟수,4의횟수,5의횟수,6의횟수]
					if (boxNum == 5) {
						System.out.printf("%d가 나올 때 까지 주사위를 %d번 던졌습니다.\n", boxNum, count);
						break;
					}
				}
			} else if (selectNo == 3) {
				
				System.out.println();

			} else if (selectNo == 4) {
					int max = num[0];
					int maxvalue = 0;
				for(int i=1; i<6; i++) {
					if(max < num[i]) {
						max = num[i];
						maxvalue = i-1;
					}
				}
				System.out.println("가장 많이 나온 수는"+ maxvalue +"입니다");

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}
}
