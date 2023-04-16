package com.myspring.proTest.test.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;


public interface TestDAO {
	public List listTests() throws DataAccessException;
	/*
	public int insertTest(TestVO TestVO) throws DataAccessException;
	public TestVO selectTestById(String id) throws DataAccessException;
	public int updateTest(TestVO TestVO) throws DataAccessException;
	public int deleteTest(String id) throws DataAccessException;
	public TestVO loginById(TestVO TestVO) throws DataAccessException;
	*/
}
