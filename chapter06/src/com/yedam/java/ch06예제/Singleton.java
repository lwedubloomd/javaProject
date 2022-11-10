package com.yedam.java.ch06예제;

public class Singleton {

	
	//private static Singleton singleton = new Singleton();
	private static Singleton singleton = null;
	
	private Singleton() {}
	
	public Singleton getInstance() {
		if(singleton == null) {
			return singleton = new Singleton();
			
		}else {
		return singleton;
	}
	}
	
	
}
