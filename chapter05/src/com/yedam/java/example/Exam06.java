package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean run =true;
			Scanner sc = new Scanner(System.in);  //ctrl shift o 누르면 그 import가져올 수 잇음
			
			int studentNum = 0;
			int[] scores = null;
			
			while(run) {
				System.out.println("--------------------------------------------");
				System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.종료 ");
				System.out.println("--------------------------------------------");
				System.out.println("선택>");
				int selectNo = Integer.parseInt(sc.nextLine());
				
				switch(selectNo) {				//if문에서 break걸면while문 자체가 종료되지만
												//switch에서 break걸면 switch문만 종료
												//글고 switch문 하면 break걸어조야댐~
				case 1:
					System.out.println("학생수>");
					studentNum = Integer.parseInt(sc.nextLine());
					scores = new int[studentNum];
					break;
				case 2:
					for(int i=0; i<scores.length; i++) {
						System.out.println("scores["+i+"]");// 사용자가 멀 입력받느지는 알아야하니깡~
						int score = Integer.parseInt(sc.nextLine());
						scores[i]=score;}
					break;
						
				case 3:
					for(int i=0; i<scores.length; i++) {
						System.out.printf("score[%d] : %d\n", i,scores[i]);}
						break;
				case 4:
							int sum = 0;
							int max = scores[0];

					for(int i = 0; i<scores.length; i ++) {
						//최고ㅗ점수
						if(max < scores[i]) {
							max = scores[i];
						}
						//총합
						sum += scores[i];
					}
					System.out.println("최고점수 :"+ max);
					System.out.println("평균 :"+ ((double)sum/scores.length));
					break;
				case 5:
					run = false;
					break;
					default:
						System.out.println("정해진 메뉴를 입력하지 않았습니다.");
						System.out.println("다시 입력해주세요");
					}
				}
			}
	}
	

