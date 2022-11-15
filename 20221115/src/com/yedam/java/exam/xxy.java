package com.yedam.java.exam;

public class xxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"010102-4","991012-1","960304-1","881012-2","040403-3"};
		
		int xy = 0;
		int xx = 0;
		
		for(int i =0; i<arr.length; i++) { 
			if(arr[i].charAt(7) == '1' || (short)arr[i].charAt(7) == '3') {
				xy++;
			}else if(arr[i].charAt(7) == '2' || arr[i].charAt(7) == '4') {
				xx++;
			}
		}
		System.out.print(" 남 "+ xy +" 여 "+ xx);
		
	}

}
