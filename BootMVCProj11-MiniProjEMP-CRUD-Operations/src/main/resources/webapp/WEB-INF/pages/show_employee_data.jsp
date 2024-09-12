<%@ page language="java" contentType="text/html; charset=UTF-8"
   isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Report</title>
</head>
<body>
<c:choose>
<c:when test="${!empty Employees}">
<h1 style="text-align: center;color: maroon;">Employee Report</h1>
<table border="2" align="center" bgcolor="cyan" >
<tr bgcolor="yellow" style="color: red"><th>empno</th><th>ename</th><th>job</th><th>sal</th><th>deptno</th><th>Operations</th></tr>
<c:forEach var="emp" items="${Employees}">
<tr style="color: black">
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.job}</td>
<td>${emp.sal}</td>
<td>${emp.deptno}</td>
<td><a href="emp_edit?no=${emp.empno}"><img alt="Employee edit" src="images/edit.jpeg" width="30" height="30"></a>
<a href="emp_delete?no=${emp.empno}" onclick="return confirm('Do u want to delete employee')"><img alt="Employee delete" src="images/delete.jpeg" width="30" height="30"></a>
</td>
</c:forEach>

</table>
</c:when>
<c:otherwise>
<h1 style="text-align: center;color: activeborder;">EMployee Data Not Found</h1>
</c:otherwise>
</c:choose>
<center>
<a href="emp_add"><img src="images/reg.jpeg" alt="Registration" width="40" height="50">Add Employee</a> &nbsp;&nbsp;
<a href="./"><img alt="Home" src="images/R.png" width="40" height="50">Home</a>
</center>

<h1 style="text-align: center; color: green;">${msg}</h1>

</body>
</html>