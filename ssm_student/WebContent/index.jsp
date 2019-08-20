<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<!-- 查询学生 -->
	<form action="StudentController/queryStudentByNo" method="get">
		<input type="text" name="stuNo"><!-- name与controller里的@RequestParam对应 -->
		<input type="submit" value="get">
	</form>
	<br>
	<!--  增加学生 -->
 	<form action="StudentController/addStudent" method="post">
	编号：	<input type="text" name="stuNo">
	姓名：	<input type="text" name="stuName">
	年龄：	<input type="text" name="stuAge">
		<input type="submit" value="add">
	</form>
	<!-- 删除学生 -->
	<form action="StudentController/deleteStudentByNo" method="post">
删除学生学号:<input type="text" name="stuNo"><!-- name与controller里的@RequestParam对应 -->
		<input type="submit" value="delete">
	</form>
	<br>
	<form action="StudentController/updateStudentByNo" method="post">
		编号：	<input type="text" name="stuNo">
	姓名：	<input type="text" name="stuName">
	年龄：	<input type="text" name="stuAge">
		<input type="submit" value="update">
	</form>
	
</body>
</html>