<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body style="background-image: url('images/col.jpeg');  background-repeat: no-repeat; width: 500px; height: 300px ">
<h1 style="color:red;text-align: center">Welcome Student Registration Page</h1>
<frm:form action="register" method="post" modelAttribute="stud">
<table>
<tr>
<td> Student number</td>
<td><frm:input path="sno"/></td></tr>
<tr>
<td> Student name</td>
<td><frm:input path="sname"/></td></tr>
<tr>
<td> Student address</td>
<td><frm:input path="addrs"/></td></tr>
<tr>
<td> Student Average</td>
<td><frm:input path="avg"/></td>
</tr>
<tr>
<td><input type="submit"  value="Register"></td>
</tr>
<tr>
<td><input type="reset"  value="Cancel"></td>
</tr>
</table>
</frm:form> 

</body>
</html>