package com.yedam.java.ch0502;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열을 선언
		//int[] intAry; //보통은 이렇게 쓴다
		//int intAry2[]; //이렇게 쓰기도 함 // 배열이 가질 수 없는 값은 없다 //모든 값 가넝~~
	 int[] intAry = null;
	 //System.out.println("intAry[0] :" + intAry[0]);
	 
	 int[] scores = {83, 90, 87};
	 System.out.println("score[0] :" + scores[0]);
	 System.out.println("score[1] :" + scores[1]);
	 System.out.println("score[2] :" + scores[2]);

	 int sum = 0;
	 for(int i=0; i<3; i++) {
		 sum += scores[i];
	 }
	 sum += scores[0];
	 sum += scores[1];
	 sum += scores[2];
	 
	 System.out.println("총합 : " + sum);
	 double avg = sum / 3.0;
	 System.out.println("평균 : "+ avg);
	 
	 //주의사항
	 int[] scoreList;
	 //scoreList = {83, 90, 87};
	 scoreList = new int[] {83,90,87};        //이때는 크기를 주면 안된다...
	 
	 }
	 }
	 
}
