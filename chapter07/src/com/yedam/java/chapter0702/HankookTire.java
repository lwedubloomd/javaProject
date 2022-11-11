package com.yedam.java.chapter0702;

public class HankookTire extends Tire{  //HankookTire extends Tire이대로 하면은 오류나는데
	
	 public HankookTire(String location, int maxRotation) {
		 super(location,maxRotation);
	 }

	 @Override
	 public boolean roll() {
			++accumulatedRotation;	
			if(accumulatedRotation	<maxRotation){
				System.out.println(location + "HankookTire 수명:"+
			(maxRotation-accumulatedRotation)+"회");
				return true;
			}else {
				System.out.println("***"+ location +"HankookTire 펑크 ***");
				return false;
			}
		}
	 
	 
	
	
}
