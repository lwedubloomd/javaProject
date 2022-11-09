package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3]; // ☜☜int[]가 값인 배열//이때는 배열을 정확하게 알아야한다,
											// 앞에가 외부의 인덱스, 뒤에가 내부의 인덱스크기
		// 첫번째 : 변수를 사용한 것
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScore[" + i + "]");
			int[] mathScore = mathScores[i];
			for (int j = 0; j < mathScore.length; j++) {
				System.out.print("\t mathScore[" + j + "]");
				System.out.println(mathScore[j]);

			}
		}
		// 두번째 : 변수 사용 X
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScore[" + i + "]");

			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.print("\t mathScores[i][" + j + "]");
				System.out.println(mathScores[i][j]);

			}
		}

		int[][] scoreList = { { 86, 65 }, { 58, 95, 73 } };
		for (int i = 0; i < scoreList.length; i++) {
			System.out.println(i + "번째 학생 성적 =====");
			for (int j = 0; j < scoreList[i].length; j++) { // [0]넣음 두번째배열 웨 두개만 나와,,?
				System.out.print(scoreList[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		int[][] englishScore = new int[2][]; // 최초로 일케 만들고 나머지는 사용자가 아라성~
		englishScore[0] = new int[3];
		englishScore[1] = new int[2];

		for (int i = 0; i < scoreList.length; i++) {
			for (int j = 0; j < englishScore[i].length; j++) {
				System.out.print("englishScore[" + i + "][" + j + "]");
				System.out.println(" : " + englishScore[i][j]);
			}
		}
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println("------------------------------------");
		System.out.println(strArray[0] == strArray[1]);// 같은 객체를 참조
		System.out.println(strArray[1] == strArray[2]);// 다른 객체를 참조
		System.out.println(strArray[1].equals(strArray[2]));// 문자열이 동일

		System.out.println();

		// for문으로 배열 복사
		int[] oldIntAry = { 1, 2, 3 }; // 얘는 세개
		int[] newIntAry = new int[5]; // 얜 다섯개,, 01234다섯개 값중 34는 oldintAry는 인식못해
		for (int i = 0; i < oldIntAry.length; i++) { // 작은 쪽 기준으로 해라~
			newIntAry[i] = oldIntAry[i];
		}
		for (int i = 0; i < newIntAry.length; i++)
			System.out.println(newIntAry[i]);

		// system.arraycopy()
		String[] oldStrAry = { "java", "array", "copy" };
		String[] newStrAry = new String[5];

		System.arraycopy(oldStrAry, 0, newStrAry, 2, oldStrAry.length);
		for (int i = 0; i < newStrAry.length; i++) {
			System.out.println(newIntAry[i]);
		}

		System.out.println("------------------------------------");
		// 향상된 for문
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum =0;
		//int index = -1;
		for(int score:scores) {		//오른 쪽에 가지고오고싶은거 배열 //왼쪽엔 변수~
		sum+=score;
			//System.out.println(score);
		//System.out.println("점수 총합 : " + ++index);
		}								
		System.out.println("점수 총합 : " + sum);
		double avg = (double)sum/scores.length;
		System.out.println("점수 평균 : " + avg);
	}
}