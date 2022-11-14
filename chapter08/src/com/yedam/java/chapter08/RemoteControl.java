package com.yedam.java.chapter08;

public interface RemoteControl {

	/*인터페이스 기본 설계도,,자식 오버라이드 해서 써는데 */
	//상수
	//public static final PI = 3.14;
	//추상메소드
	//public void method1();
	
	//기본 설계도
	//대규모 프로젝드 -> 번역
	//A-> 영어를 한글로 번역(메소드 번역)
	//B -> 영어를 일어로 번역(메소드 method1())
	//c -> 영어를 중국어로 번역할 때(메소드 method2())
	//같은 번역의 기능을 하는데 메소드 이름이 다를 때 
	//다른 내용으로 메소드를 만들 수 있..다?
	//번역의 필요한 기능을 정의해두면 개발자들이 지들 입맛에 맞춰서 기능을 구현할 수 있다.
	
	//프로젝트 완료
	//같은 이름으로 구현
	
	
	//상수//final쓸 때는 전부 대문자로 하는디 여기서는 전부 다 final의 기능을 한다..
	//인터페이스는 디폴트가 final임~ 그래서 final은 생략해도 댐~
	//필요하면 쓰고 안써도 상관 없음 
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메소드
	//▼▼▼public abstract void turnOn(); 이거랑 같음 public void turnOn();일케 써도 abstract 생략됨~
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	//상속받는거를 구현객체라고 한다
	//자식 클래스를 구현 클래스라고 항다~
	
	
}
