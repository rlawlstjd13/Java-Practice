<%--오늘 날짜를 보여줄수 있는 jsp페이지 --%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//script let 영역
	System.out.println("사용자가 jsp 페이지를 요청했습니다");
	int a = 10;
	%>
	<p>jsp 페이지 입니다.</p>
	<strong><%= java.time.LocalTime.now() %></strong><br/>	<!-- 표현식 -->
	<p>a의 값은 <%=a %> 입니다</p>
	<%--jsp 주석 --%>
</body>
</html>