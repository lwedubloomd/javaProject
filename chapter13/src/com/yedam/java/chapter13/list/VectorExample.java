package com.yedam.java.chapter13.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Board> list = new Vector<>();
		
		list.add(new Board("제목1","내용1","글쓴이1"));
		Board board = new Board("제목2","내용2","글쓴이2");
		
		list.add(board);
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		list.remove(2);
		list.remove(3);	//3,5가 삭제되는디 원래에서 인덱스2 값(3번째) 삭제하고,,, 
						//삭제하고 난 후 결과에 인덱스3 값(4번째) 삭제해서 구럼..
		
		for(Board temp : list) {
			System.out.println(temp.subject + temp.content + temp.writer);
		}
		
		System.out.println("=============둘이 같은 내ㅛㅇㅇ...?==============");

		for(int i = 0; i<list.size();i++) {
			Board board2 = list.get(i);
			System.out.println(board2.subject + board2.content + board2.writer);
		}
	}

}
