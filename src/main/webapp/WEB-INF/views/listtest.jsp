<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<% 
	request.setCharacterEncoding("utf-8"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
<style>
	table {
		font-size:20px;
		border-collapse : collapse;
	}
	.h2 {
		color:purple;
		
	}
	a {
		text-decoration:none;
		margin-top:8px;
	 }
	 tr {
	 	height:30px;
	 	line-height:25px;
	 }
	 
</style>
</head>
<body>
	<table border="1" align="center" width="900px" >
		<tr align="center" bgcolor="#fde6e7">
			<td>아이디</td>
			<td>비밀번호</td>
			<td>이름</td>
			<td>이메일</td>
			<td>가입일</td>
		</tr>

		<c:forEach var="test" items="${testsList}">
			<tr align="center">
				<td>${test.id}</td>
				<td>${test.pwd}</td>
				<td>${test.name}</td>
				<td>${test.email}</td>
				<td>${test.joinDate}</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>