package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1. JDBC Driver 로딩 //※가장 중요※
			// import라는 개념으로 외부 것을 사용햇는디 이것은 import의 개념이 아님
			Class.forName("org.sqlite.JDBC");

			// 2. DB 서버 접속
			// 오라클의 경우는 경로 정해져있다 but,,
			String url = "jdbc:sqlite:/D:/dev/DataBase/TestDataBase.db";
			Connection conn = DriverManager.getConnection(url);

			// 3. Statement of PreparedStatement 객체 생성
			Statement stmt = conn.createStatement();

			// 4. SQL 실행
			ResultSet rs = stmt.executeQuery("SELECT student_id, student_name, student_dept FROM student");

			// 5. 결과 값 출력하기
			while (rs.next()) {
				int sId = rs.getInt("student_id"); // 괄호 안에 필드명 가져왕 sql에 as로 별칭 선언 할 수 있는데
				String sName = rs.getString("student_name"); // 별칭으로 햇으면 sql의 결과값이 별칭으로 오기 땜에 별칭명으로 괄호에 써라
				String sDept = rs.getString("student_dept");
				System.out.println("학번 : " + sId);
				System.out.println("이름 : " + sName);
				System.out.println("학년 : " + sDept);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. 자원 해제하기
			if(rs != null) rs.close();		//사용하는지 확인하고 안하면 닫음
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
	}

}
