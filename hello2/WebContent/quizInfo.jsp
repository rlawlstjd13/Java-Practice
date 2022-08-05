<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
<%-- name--%>
	<%
		request.setCharacterEncoding("UTF-8");
	    String answer = request.getParameter("clear");
	%>

	<%
		if (answer.equals("서울")) {
	%>
	confirm("정답");

	<%
		} else {
	%>
	confirm("오답");
	<%
		}
	%>
	</script>

</body>
</html>