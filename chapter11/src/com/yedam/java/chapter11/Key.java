package com.yedam.java.chapter11;

public class Key {
	
	public int number;
	
	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) 
			return true;	
			
		}
		return false;
	}

	@Override
	public String toString() {
		
		//return "Member[" +number+"]"이 디폴트 값임
		return "Key 값은 :"  + number;//원하는 값을 가공해서 넣어도 된다
	}
	
	
}
