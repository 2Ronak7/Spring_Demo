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
<table>
<c:forEach var="list" items="${studentDetail}"> 
<tr>
<td>Id</td><td>${list.studentId}</td>
</tr>
<tr>
<td>Student Name</td><td>${list.studentName}</td>
</tr>
<tr>
<td>Mobile</td><td>${list.studentMob}</td>
</tr>
<tr>
<td>City</td><td>${list.studentCity}</td>
</tr>
</c:forEach>
<tr><td><a href="<%=request.getContextPath() %>/viewStudent">View</a></td></tr>
</table>
</body>
</html>