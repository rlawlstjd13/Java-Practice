<%--jsp페이지에 사용자의 이름 나이 성별 입력받을수 잇는 form양식 작성 --%>
<%--로그인창? 느낌이고 액션으로 request로이동 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="/seong/requestInfo.jsp" method="post">
 <%--get ??????  post방식은 body가있고(한글이꺠짐) decoding해야함--%>
   <label>이름<input type="text" name= "name" placeholder="이름을 입력해" /></label>
   <label>나이<input type="number" name= "age" placeholder="나이를 입력해"/></label>
   <label><input type="radio" name="gender" value="male" />남성</label>
   <label><input type="radio" name=gender" value="female" />여성</label>
   
   <label><input type="checkbox" name="hobby" value="java">자바</label>
   <label><input type="checkbox" name="hobby" value="html">하이퍼 텍스트 마크업 랭귀지</label>
   <label><input type="checkbox" name="hobby" value="css">캐스캐이딩 스타일 시트</label>
   <label><input type="checkbox" name="hobby" value="javascript">자바스크립트</label>
   <label><input type="submit" value="입력 완료"/>
 
 
 
 </form>

</body>
</html>