<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>퀴즈페이지</title>
</head>
<body>
  <p>다음 문제의 답을 입력하세요.</p>
  <p>대한민국의 수도는?</p>
  <form action="/seong/quizInfo.jsp" method="post">
  <label>정답<input type="text" name="clear" placeholder="정답을입력해" /></label>
  
  <input type="submit" value="입력 완료"/>
  
  
  
  </form>

</body>
</html>