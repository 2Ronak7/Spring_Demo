<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

<form action="<%=request.getContextPath() %>/insertStudent">
	Student Name : <input type="text" name="studentName"><br>
	City : <input type="text" name="studentCity"><br>
	Mobile No. : <input type="text" name="studentMob"><br>
	Course Name : <!-- <input type="text" name="courseVo.courseId"><br> -->
	<select name="courseId">
<c:forEach items="${courseList}" var="list">
<option value="${list.courseId}">${list.courseName}</option>
</c:forEach>
</select>
	<br>
	
	<input type="submit" value="Insert">
	<a href="<%=request.getContextPath() %>/viewStudent">View</a>
</form>

</body>
</html>