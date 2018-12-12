<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/updateStudent">
<c:forEach var="list" items="${studentList}">
<input type="hidden" name="studentId" value="${list.studentId}">
Student Name : <input type="text" name="studentName" value="${list.studentName}"><br>
City : <input type="text" name="studentCity" value="${list.studentCity}"><br>
Mobile No. : <input type="text" name="studentMob" value="${list.studentMob}"><br>
</c:forEach>
Course Name : <select name="courseId">
<c:forEach items="${courseList}" var="courseList">
<option value="${courseList.courseId}">${courseList.courseName}</option>
</c:forEach>
</select><br>
<input type="submit" value="Update">
</form>
</body>
</html>