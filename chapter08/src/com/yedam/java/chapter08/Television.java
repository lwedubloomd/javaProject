package com.yedam.java.chapter08;

public class Television implements RemoteControl,/*p.377다중인터페이스구현 추가내용*/ Search{
	//만들면 무족건 오류뜨는디 마우스 커서 올려놓고 머시기 만드르삼
	//인터페이스 
	private int volume;//public이 아니라 웨 private를 스는지...?
	
	
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {//volum은 0보다 작은 수가 없움,,,그래서 영으로 맞춰조야댕~
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 tv 볼륨 :"+ this.volume);
	}

	
	//+플러스내용 p.377 다중인터페이스 구현
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url);
	}
}
