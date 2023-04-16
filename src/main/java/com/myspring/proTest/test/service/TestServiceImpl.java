package com.myspring.proTest.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.proTest.test.dao.TestDAO;

@Service("testService")
@Transactional(propagation = Propagation.REQUIRED)
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDAO testDAO;
	
	@Override
	public List listTests() throws DataAccessException {
		List testsList = null;
		testsList = testDAO.listTests();
		return testsList;
	}
	
	/*
	@Override
	public int addMember(MemberVO memberVO) throws DataAccessException {
		return memberDAO.insertMember(memberVO);
	}
	
	@Override
	public MemberVO modMember(String id) throws DataAccessException {
		return memberDAO.selectMemberById(id);
	}
	
	@Override
	public int updateMember(MemberVO memberVO) throws DataAccessException {
		return memberDAO.updateMember(memberVO);
	}
	
	@Override
	public int removeMember(String id) throws DataAccessException {
		return memberDAO.deleteMember(id);
	}
	
	@Override
	public MemberVO login(MemberVO memberVO) throws Exception {
		return memberDAO.loginById(memberVO);
	}
	*/
}
