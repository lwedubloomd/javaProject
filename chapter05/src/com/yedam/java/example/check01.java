package com.yedam.java.example;

public class check01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//문1)주어진 배열의 총합과 평균을 구하세요
		int[] array = {10,53,26,85,75};
		int sum = 0;
		for(int i=0; i<array.length; i++) {	//i는 1부터 시작하몬 안됨 배열에 잇는 인덱스값을 가져올 것이기 때문에
											//0부터 시작해야한다 인덱스 위치는 0부터 시작하기땜에
											//i<array.length로 하거나 i<=(array.length-1)해야하는데
											//그 이유는 length는 1부터 시작하는 것이기 땜에,,,
			sum += array[i];
		}
		double avg = (double)sum/array.length;	//sum은 정수인데 소숫값 나올 수도 잇으니
												//캐스팅괄호 써서 타입변환 시켜조라~
		System.out.println("도합 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.printf("평균 : %.2f\n",avg);
		
		//문제2) 배열의 최대값과 최속밧을 구하세요
		int max=array[0];
		int min=array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
		//문제3) 2번에서 구한 최대값과 최소값이 각각 인덱스가 먼지 구하세요
		//int idx=0;이라고 내가 변수를 넣어줫는데 그럴 필요가 없엇움,,,
		int index=0;
		for(int i=0; i<array.length; i++) {
			if( min == array[i]) {
				index=i;
				System.out.println(index);
			}
			if( max == array[i]) {
				index=i;
				System.out.println(index);
			}
		}
	}
		
	}


