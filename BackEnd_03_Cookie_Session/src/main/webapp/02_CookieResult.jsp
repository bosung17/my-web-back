<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키생산공장</title>
</head>
<body>
	<h2>현재 내브라우저에 있는 쿠키 정보</h2>
	<!-- 쿠키 다 출력 -->
	<%
		Cookie[] cookies = request.getCookies();
		if (cookies != null){
			for (Cookie c : cookies){
				out.print(c.getName() + "<br>");
			}
		}
		else{
			out.print("no cookie");
		}
	
	
	
	%>

	<a href="index.html">홈으로</a>
</body>
</html>