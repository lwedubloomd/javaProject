package com.yedam.java.chapter08;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl; //A만 쓸 수 잇음
		ia.methodA();
		
		InterfaceB ib = impl; //B만 쓸 수 있음
		ib.methodB();
		
		InterfaceC ic = impl;	//A B에 있는 것 다 쓸 수 있음.
		ic.methodA();			//이유 : C는 A,B 둘 다에게 상속 받았기 땜에
		ic.methodB();
		ic.methodC();
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
}
