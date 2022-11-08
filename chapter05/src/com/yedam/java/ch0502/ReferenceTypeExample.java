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
	 for(int i=0; i<scores.length; i++) { //리터럴로 넣느냐 length라는 어쩌구로 쓰느냐~
		 									//but length로 쓸 수 바께 없게 될 것이다,,,,,,,
		 sum += scores[i]/3.0;	//누적
	 }
	 sum += scores[0];
	 sum += scores[1];
	 sum += scores[2];
	 
	 System.out.println("총합 : " + sum);
	 double avg = sum / 3.0;
	 System.out.println("평균 : "+ avg);
	 
	 //주의사항
	 int[] scoreList = null;
	 //scoreList = {83, 90, 87};
	 scoreList = new int[] {83, 90, 87};        //이때는 크기를 주면 안된다...new?
	 //scoreList ={83,90,87}; //일케는 값을 못 준댕 ㅋ
	 System.out.println("scoreList[0] :" + scoreList[0]);
	 System.out.println("scoreList[1] :" + scoreList[1]);
	 System.out.println("scoreList[2] :" + scoreList[2]);

	 
	 sum =0;
	 for(int i=0; i<3; i++) {
		 sum = sum + scoreList[i];
	 
	 System.out.println("총합 :" + sum);
	 
	 }
	 //sum= add(new int[] {83, 90, 87});
	 //new 연산자로 배열 생성
	 int[] array = new int[3];
	 for(int i=0; i<3; i++) {
		 System.out.println("array["+i+"]:"+array[i]);
	 }
	 String[] strAry = new String[4];
	 for(int i=0; i<strAry.length; i++) {
		 strAry[i] = String.valueOf(i);
	 }
	 }
	//static int add(int[] numList) {
	 
}



















