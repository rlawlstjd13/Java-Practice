<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 창</title>
</head>
<!-- name을 path로 f:도 쓰고 그러면 usercontroller에서 쓴값이 일로옴-->
<body>
	<f:form modelAttribute="user" method="post">
	<f:errors path="name"/>
		<f:input type="text" path="name" /> 
		<f:errors path="age"/>
		<f:input type="number" path="age" /> 
		<input type="submit" />
	</f:form>

</body>
</html>