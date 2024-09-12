<%@ page language="java" contentType="text/html; charset=UTF-8"
   isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Employee Report</title>
</head>
<body>
<div class="container">
<c:choose>
<c:when test="${!empty Employees.getContent()}">
<h1 style="text-align: center;color: maroon;">Employee Report</h1>
<!-- <table border="2" align="center" bgcolor="cyan" > -->
<table class="table table-hover" align="center">
<tr bgcolor="yellow" style="color: red"><th>Empno</th>
<th>Empname</th>
<th>job</th>
<th>Sal</th>
<th>deptno</th>
<th>Operations</th></tr>
<c:forEach var="emp" items="${Employees.getContent()}">
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

<p style="text-align: center;">
<c:if test="${Employees.hasPrevious()}">
<a href="preport?page=${Emplyees.getPageable().getPageNumber()-1}">Previous</a> &nbsp;&nbsp;
</c:if>
<c:if test="${!Employees.isFirst()}"><a href="preport?page=0">First</a>&nbsp;&nbsp;
</c:if> 

<c:forEach var="i" begin="1" end="${Employees.getTotalPages()}">
[<a href="preport?page=${i-1}">${i}</a>]</c:forEach>

<c:if test="${!Employees.isLast()}">
<a href="preport?page=${Employees.getTotalPages()-1}">Last</a>
&nbsp;&nbsp;
</c:if>

<c:if test="${Employees.hasNext()}">
<a href="preport?page=${Employees.getPageable().getPageNumber()+1}">
Next</a>
</c:if>

</p>
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

</div>
</body>
</html>