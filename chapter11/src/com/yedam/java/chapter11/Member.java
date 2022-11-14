package com.yedam.java.chapter11;

public class Member {

	public String id;
	public String id2;
	public String id3;
	public String id4;
	public String id5;
	public String id6;
	public String id7;
	

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		//object obj = new Member("blue")//자식 클래스에꺼 사용할려면 강제타입변환 해야함
		
		
		// TODO Auto-generated method stub
		//overide해서 object눌러서 나오는거는...원래 public어쩌구 다음엔 return super.equals(obj);본래...이런 모양임
		
		Member member = (Member) obj; //강제 타입 변환 member타입으로~
		//Member member = new Member("blue");
		
		if (id.equals(member.id)) {
			return true;
		}
		return false;

	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//String a= "1";
		//String b= "1"; //String은 같은 데이터면 같은 주소값을 참조
		//그래서 a,b는 같은 객체이고 같은 주소 값을 가지고 잇움
		
		return id.hashCode();
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", id5=" + id5 + ", id6=" + id6
				+ ", id7=" + id7 + "]";
	}

}
