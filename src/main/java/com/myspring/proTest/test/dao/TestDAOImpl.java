package com.myspring.proTest.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.proTest.test.vo.TestVO;

@Repository("testDAO")
public class TestDAOImpl  implements TestDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List listTests() throws DataAccessException {
		List<TestVO> testsList = null;
		testsList = sqlSession.selectList("mapper.test.listTests");
		return testsList;
	}
	
	/*
	@Override 
	public int insertMember(MemberVO memberVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.member.insertMember", memberVO);
		return result;
	}
	
	@Override
	public MemberVO selectMemberById(String id) throws DataAccessException {
		MemberVO memInfo= sqlSession.selectOne("mapper.member.selectMemberById", id);
		return memInfo;  
	}
	
	@Override 
	public int updateMember(MemberVO memberVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.member.updateMember", memberVO);
		return result;
	}
	
	@Override
	public int deleteMember(String id) throws DataAccessException {
		int result = sqlSession.delete("mapper.member.deleteMember", id);
		return result;
	}
	
	@Override
	public MemberVO loginById(MemberVO memberVO) throws DataAccessException {
		MemberVO vo = sqlSession.selectOne("mapper.member.loginById", memberVO);
		return vo;
	}
	*/
 }
