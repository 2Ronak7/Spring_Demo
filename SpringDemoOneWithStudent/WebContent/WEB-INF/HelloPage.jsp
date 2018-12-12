<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/hello">
<input type="text" name="name" placeholder="Enter Your Name"><br>
<form:errors path = "name"  />
<input type="text" name="contactno" placeholder="Enter Your Contact No"><br>

<!-- <input type="text" name="txtname" placeholder="Enter Your Name"><br>
<input type="text" name="txtsurname" placeholder="Enter Your Surname"><br>
 -->


<input type="submit" value="Submit">
</form>
</body>
</html>