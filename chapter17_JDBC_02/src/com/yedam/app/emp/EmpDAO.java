package com.yedam.app.emp;

import java.util.List;

import com.yedam.app.EmpVO;

public interface EmpDAO {
	//전체조회
	List<EmpVO> selectAll();
	
	//단건조회
	EmpVO selectOne(EmpVO empVO);
	
	
	//등록
	void insert(EmpVO empVO);
	
	//수정
	void update(EmpVO empVO);
	
	//삭제
	void delete(int empVO);
}
