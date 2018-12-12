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
<table border="3">
<tr>
<td>Id</td>
<td>Student Name</td>
<td>Mobile</td>
<td>City</td>
<td>Course Name</td>
</tr>

<c:forEach var="list" items="${studentList}"> 

<tr>
<td>${list.studentId}</td>
<td>${list.studentName}<%-- <a href="<%=request.getContextPath() %>/detailofStudent/${list.studentId}">${list.studentName}</a> --%></td>
<td>${list.studentMob}</td>
<td>${list.studentCity}</td>
<td>${list.courseVo.courseName}</td>

<td><a href="<%=request.getContextPath() %>/editStudent/${list.studentId}">Edit</a></td>
<%-- <td><a href="<%=request.getContextPath() %>/deleteStudent/${list.studentId}">Delete</a></td> --%>

</tr>


</c:forEach>

</body>
</html>