<%@page import="java.net.URLDecoder"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>클라이언트 및 서버 정보</title>
</head>
<body>
클라이언트IP= <%=request.getRemoteAddr() %> <br/>
요청정보길이 = <%= request.getContentLength() %> <br/>
요청정보 인코딩 = <%= request.getCharacterEncoding() %> <br/>
요청정보 컨텐츠타입 = <%= request.getContentType() %> <br/>
요청정보 프로토콜 = <%= request.getProtocol() %> <br/>
요청정보 전송방식 = <%=request.getMethod() %> <br/>
요청 URI = <%= request.getRequestURI() %> <br/>
컨텍스트경로 = <%= request.getContextPath() %> <br/>
서버이름 = <%= request.getServerName() %> <br/>
서버포트 = <%= request.getServerPort() %>
-----------------------------------<br/>
<%-- request.setCharacterEncoding("UTF-8"); 디코딩하는법--%>
<% 
 request.setCharacterEncoding("UTF-8");
%>
<%=request.getRequestURL() %> <br/>
<%=request.getQueryString() %> <br/>

사용자 이름 = <%=request.getParameter("name") %> <br />
사용자 나이 = <%=request.getParameter("age") %> <br/>
사용자 성별 = <%=request.getParameter("gender") %> <br/>
사용자 취미= <%=Arrays.toString(request.getParameterValues("hobby")) %> <br/>
<%--form에서 온거 맵에넣기? --%>
<%
Map<String, String[]> map = request.getParameterMap();
for(Entry<String, String[]> e: map.entrySet()){
	String key = e.getKey();
	String[] value = e.getValue();	

%> 
         <%= key %><br/>
         <%= Arrays.toString(value) %> 
<%
}
%>
</body>
</html>