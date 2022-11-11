package com.yedam.java.chapter0702;

public class Application3 {

	public static void method1(Parent parent) {
		if(parent instanceof Child) {
		//비교할 타입============????//
			Child child = (Child)parent;
			System.out.println("method1 - child 변환 성공");
		}else {
			System.out.println("변환 실패");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("method2 - child 변환 성공");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method2(parentB);
		
		
		
		
		
		
		
		
		
		
		System.out.println("-------------------------------");		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		//driver.drive(Vehicle vehicle = new Bus)
		driver.drive(bus);
		
		
		driver.drive(texi);
		
		
		System.out.println("-------------------------------");
		
		Animal animal = null;
		
		animal = new Cat();
		animal.speak();
		
		animal = new Dog();
		animal.speak();		//다형성 어쩌구
		
		
		System.out.println("-------------------------------");
		Parent parent = new Child();
		
		//parent.field2 = "parent";
		parent.method1();
		parent.method2();
		
		//parnet.field2 = "child";
		//parnet.method3();
		
		//Casting
		Child child = (Child)parent;
		
		child.field2 = "parent";
		child.method3();
	
	
	}

}
