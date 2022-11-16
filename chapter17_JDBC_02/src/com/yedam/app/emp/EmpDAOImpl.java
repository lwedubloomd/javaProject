package com.yedam.app.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class EmpDAOImpl extends DAO implements EmpDAO {

	//싱글톤
	private static EmpDAO instance = null;
	
	public static EmpDAO getInstance() {
		if(instance == null)
			instance = new EmpDAOImpl();
		return instance;
	}
	
	@Override
	public List<EmpVO> selectAll() {
		List<EmpVO> list = new ArrayList<>();
		try {
			connect();	//메뉴 하나를 실행하고 나서 다음메뉴 시작하기 전 까지 얼마나 될 지 모르는데 데이터베이스 입장에서는 그게 loss이다
						//그만큼 다른 프로그램이 사용을 못해서 사용할때마다 시작하고 끊어내능 거를 한당...
			stmt = conn.createStatement();
			String sql = "SELECT * FROM employees";
			rs = stmt.executeQuery(sql);
			int count = 0;
			while(rs.next()) {
				EmpVO empVO = new EmpVO();
				empVO.setEmpNO(rs.getInt("emp_no"));
				empVO.setBirthDate(rs.getString("birth_date"));
				empVO.setFirstName(rs.getString("first_name"));
				empVO.setLastName(rs.getString("last_name"));
				empVO.setGender(rs.getString("gender"));
				empVO.setHireDate(rs.getString("hire_date"));
				list.add(empVO);
				
				if (++count >= 20)
		               break; // 지금 데이터가 30,000개라서 스무개까지만 불러올거임
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}

	@Override
	public EmpVO selectOne(EmpVO empVo) {
		EmpVO findVO = null;
		try {
			connect();
			String sql = "UPDATE employees SET first_name = ? WHERE emp_no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empVo.getFirstName());
			pstmt.setInt(2, empVo.getEmpNO());
			
		
			
	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return findVO;
	}

	@Override
	public void insert(EmpVO empVO) {
		try {
			connect();
			String sql = "INSERT INTO employees VALUES (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empVO.getEmpNO());
			pstmt.setString(2, empVO.getBirthDate());
			pstmt.setString(3, empVO.getFirstName());
			pstmt.setString(4, empVO.getLastName());
			pstmt.setString(5, empVO.getGender());
			pstmt.setString(6, empVO.getHireDate());
			
			int result = pstmt.executeUpdate();
			if(result >0) {
				System.out.println("정상적으로 등록되었습니다.");
				
			}else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

	@Override
	public void update(EmpVO empVO) {
		try {
			connect();
			String sql = "INSERT INTO employees VALUES (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empVO.getEmpNO());
			pstmt.setString(2, empVO.getBirthDate());
			pstmt.setString(3, empVO.getFirstName());
			pstmt.setString(4, empVO.getLastName());
			pstmt.setString(5, empVO.getGender());
			pstmt.setString(6, empVO.getHireDate());
			
			int result = pstmt.executeUpdate();
			if(result >0) {
				System.out.println("정상적으로 등록되었습니다.");
				
			}else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	@Override
	public void delete(int empNo) {
		// TODO Auto-generated method stub
		try {
			connect();
			String sql = "DELETE FROM employees WHERE emp_no ="+ empNo;
			int result = stmt.executeUpdate(sql);
			
					if(result >0) {
						System.out.println("정상적으로 삭제되었습니다.");
						
					}else {
						System.out.println("정상적으로 삭제되지 않았습니다.");
					}
			
	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

}
