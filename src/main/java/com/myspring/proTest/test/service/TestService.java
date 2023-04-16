package com.myspring.proTest.test.service;

import java.util.List;

import org.springframework.dao.DataAccessException;


public interface TestService {
	public List listTests() throws DataAccessException;
	/*
	public int addTest(TestVO TestVO) throws DataAccessException;
	public TestVO modTest(String id) throws DataAccessException;
	public int updateTest(TestVO TestVO) throws DataAccessException;
	public int removeTest(String id) throws DataAccessException;
	public TestVO login(TestVO TestVO) throws Exception;
	*/
}
