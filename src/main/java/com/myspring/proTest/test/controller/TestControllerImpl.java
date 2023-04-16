package com.myspring.proTest.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.proTest.test.service.TestService;
import com.myspring.proTest.test.vo.TestVO;

@Controller("testController")
public class TestControllerImpl implements TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestControllerImpl.class);
	
	@Autowired
	private TestService testService;
	@Autowired
	private TestVO testVO;
	
	@Override
	@RequestMapping(value="/test9.do", method = RequestMethod.POST)
	public ModelAndView listTests(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = "listtest";
		
		logger.info("viewName:" + viewName);
		logger.debug("viewName:" + viewName);
		List testsList = testService.listTests();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("testsList", testsList);
		return mav;
	}
	
	/*
	@Override
	@RequestMapping(value="/member/addMember.do", method = RequestMethod.POST)
	public ModelAndView addMember(@ModelAttribute("member") MemberVO memberVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		int result = 0;
		result = memberService.addMember(memberVO);
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		return mav;
	}
	
	//수정창
	@Override
	@RequestMapping(value="/member/modMember.do", method = RequestMethod.GET)
	public ModelAndView modMember(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		MemberVO memInfo = memberService.modMember(id);
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("memInfo", memInfo);
		return mav;
	}
	
	//수정
	@Override
	@RequestMapping(value="/member/updateMember.do", method = RequestMethod.POST)
	public ModelAndView updateMember(@ModelAttribute("member") MemberVO memberVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		int result = 0;
		result = memberService.updateMember(memberVO);
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		return mav;
	  }
	
	@Override
	@RequestMapping(value="/member/removeMember.do", method = RequestMethod.GET)
	public ModelAndView removeMember(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		memberService.removeMember(id);
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		return mav;
	}
	
	@RequestMapping(value = {"/member/loginForm.do", "/member/memberForm.do"}, method = RequestMethod.GET)
	//@RequestMapping(value="/member/*Form.do", method = RequestMethod.GET)
	public ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
}
	@Override
	@RequestMapping(value = {"/member/login.do"}, method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("member") MemberVO member, 
							  RedirectAttributes rAttr,
							  HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		memberVO = memberService.login(member);
		if(memberVO != null) {
			HttpSession session = request.getSession();
			session.setAttribute("member", memberVO);
			session.setAttribute("isLogOn", true);
			mav.setViewName("redirect:/member/listMembers.do");
		} else {
			rAttr.addAttribute("result", "loginFailed");
			mav.setViewName("redirect:/member/loginForm.do");
		}
		return mav;
	}
	
	@Override
	@RequestMapping(value = {"/member/logout.do"}, method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		session.removeAttribute("member");
		session.removeAttribute("isLogOn");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/member/listMembers.do");
		return mav;
	}
	
	@RequestMapping(value = {"/member/*Form.do"}, method = RequestMethod.GET)
	private ModelAndView form(@RequestParam(value="result", required=false) String result,
							  HttpServletRequest request, HttpServletResponse response) throws Exception {
		//String viewName = (String)request.get.Attribute("viewName");
		String viewName = (String)request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", result);
		mav.setViewName(viewName);
		return mav;
	}
	*/
	
	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if(uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}
		
		int begin = 0;
		if(!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}
		
		int end;
		if(uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if(uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}
		
		String viewName = uri.substring(begin, end);
		if(viewName.indexOf(".") != -1) {
			viewName = viewName.substring(0, viewName.lastIndexOf("."));
		}
		
		if(viewName.lastIndexOf("/") != -1) {
			viewName = viewName.substring(viewName.lastIndexOf("/", 1), viewName.length());
		}
		return viewName;
	}

}
	
