package com.yedam.java.chapter11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;//sql보다 util이 더 디테일해~ util쓰세용

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1); // 원래 이렇게 나옴Tue Nov 15 10:18:25 KST 2022
		
		
		System.out.println("-----------------------------------------");
		// ▽▽▽원하는 형태로 바꿔주기 위한 것
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// 이거 영어 타입 yyyy 이렁거는 잘 지켜줘야함 MM월 mm분 대소문자 구분
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);//result : 2022년 11월 15일 10시 40분 28초
		System.out.println("-----------------------------------------");
		
		
		// Calendar 클래스

		Calendar cld = Calendar.getInstance();
		
		
		//년
		int year = cld.get(Calendar.YEAR);
		System.out.println("년: "+year);
		System.out.println("-----------------------------------------");
		
		//달
		int month = cld.get(Calendar.MONTH) + 1;
		System.out.println("월: "+month);
		System.out.println("-----------------------------------------");
		
		//일
		int day = cld.get(Calendar.DAY_OF_MONTH) + 1;
		System.out.println("일: "+day);
		System.out.println("-----------------------------------------");
		
		//요일
		int week = cld.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;

		case 3:
			strWeek = "화";
			break;

		case 4:
			strWeek = "수";
			break;

		case 5:
			strWeek = "목";
			break;

		case 6:
			strWeek = "금";
			break;

		case 7:
			strWeek = "토";
			break;
		case 1:
			strWeek = "일";
			break;

		}
		System.out.println("요일: "+week);
		System.out.println("바꾼 요일: "+strWeek);
		System.out.println("-----------------------------------------");

		//오전 오후
		int amPm = cld.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == 0) {
			strAmPm ="오전";
		}else {
			strAmPm ="오후";
			
		}

		System.out.println("오전,오후:"+amPm);
		System.out.println("바꾼 오전,오후:"+strAmPm);
		System.out.println("-----------------------------------------");
	}

}
