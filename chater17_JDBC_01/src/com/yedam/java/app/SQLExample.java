package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//※※※※※JDBC는 무족건 6단계 반복이다!
		try {
			// 1. JDBC Driver 로딩
			Class.forName("org.sqlite.JDBC");
			// 2. DBMS 서버와 접속하기	//엄연히 말해서 DB에는 접속 못함?
			String url = "jdbc:sqlite:/D:/dev/DataBase/TestDataBase.db";
			conn = DriverManager.getConnection(url);
			
			/*********************INSERT*********************/
			// 3. Statement of PreparedStatement 객체 생성
			String insert = "INSERT INTO student (student_id, student_name) "
					+ "VALUES (?, ?)";//?는 변수임
			ps = conn.prepareStatement(insert);
			ps.setInt(1, 110);//호출하는 순서는 상관없는데 괄호 첫번째에 순서 정해주면 됨...(순서, 넣을 데이터)
			ps.setString(2, "윤달하");//물음표 두개는 메소드도 두개여야한다..
			
			// 4. SQL 실행하기
			int result = ps.executeUpdate();
			
			
			// 5. 결과 출력하기
			System.out.println("insert 결과 :" + result);
			
			/*********************SELECT*********************/
			// 3. Statement of PreparedStatement 객체 생성
			stmt = conn.createStatement();
			
			// 4. SQL 실행하기
			String select = "SELECT student_id, student_name, student_dept FROM student";
			rs = stmt.executeQuery(select);
			
			// 5. 결과 출력하기
			while(rs.next()) {
				int id = rs.getInt("student_id");
				String name = rs.getString("student_name");
				String dept = rs.getString("student_dept");
				
				System.out.printf("학번 : %d, 이름 : %s, 학년 : %s \n",id, name, dept);
			}
			
			
			/*********************UPDATE*********************/
			// 3. Statement of PreparedStatement 객체 생성
			String update = "UPDATE student SET student_dept = ? WHERE student_id = ? ";		//WHERE
			ps = conn.prepareStatement(update);
			ps.setInt(2,110);
			ps.setString(1,"3학년");
			
			// 4. SQL 실행하기
			result = ps.executeUpdate();
			
			// 5. 결과 출력하기
			System.out.println("update 결과 :" + result);
			
			/*********************DELETE*********************/
			// 3. Statement of PreparedStatement 객체 생성
			stmt = conn.createStatement();
			// 4. SQL 실행하기
			String delete = "DELETE FROM student WHERE student_id = "+110;//얘한테 값을 줄려면 문자열 결합을 해줘야한다
			//DELETE FROM student WHERE student_id = 110 =>결과임
			result = stmt.executeUpdate(delete);
			
			// 5. 결과 출력하기
			System.out.println("delete 결과 :"+ result);
			
			
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC Driver Loding Fail");//오류 나는 상황 only 원임
		}catch(SQLException e) {	//e =>exception임.. 예외.......관습적으로 e로 쓴다.
			System.out.println("SQL관련 예외 :"+ e.getMessage());
			e.printStackTrace();//예외가 난 부분 출력
		}catch(Exception e) {	//e =>exception임.. 예외.......관습적으로 e로 쓴다.
			e.printStackTrace();
		}try{
			// 6. 자원 해제하기
			
			if(rs != null) rs.close();		//사용하는지 확인하고 안하면 닫음
			if(stmt != null) stmt.close();
			if(ps != null) ps.close();			
			if(conn != null) conn.close();
		}catch (SQLException e){
			System.out.println("정상적으로 자원이 해제되지 않았습니다.");
		}
	}
}
