package com.myspring.proTest.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;


public interface TestController {
	
	public ModelAndView listTests(HttpServletRequest request, HttpServletResponse response) throws Exception;
	/*
	public ModelAndView addMember(@ModelAttribute("info") TestVO memberVO, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView modMember(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView updateMember(@ModelAttribute("info") TestVO memberVO, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView removeMember(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView login(@ModelAttribute("member") TestVO member, 
							  RedirectAttributes rAttr, 
							  HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception;
	*/
}
