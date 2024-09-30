<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글등록</title>
</head>
<body>
	<h2>게시글등록</h2>
	<form action="board" method="post">
		<input type="hidden" name="action" value="write">
		
		<label for="title">글 제목:</label>
		<input type="text" id="title" name="title" required><br><br>
		
		<label for="author">글쓴이:</label>
		<input type="text" id="author" name="writer" value="익명" required><br><br>
		
		<label for="content">글 내용:</label>
		<textarea id="content" name="content" rows="10" cols="30" required></textarea><br><br>
		
		<input type="submit" value="등록">
	</form>
</body>
</html>
