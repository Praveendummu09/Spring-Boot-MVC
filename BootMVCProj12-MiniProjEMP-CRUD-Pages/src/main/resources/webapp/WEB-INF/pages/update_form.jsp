<%@ page language="java" contentType="text/html; charset=UTF-8"
   isELIgnored="false" pageEncoding="UTF-8"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align: center;color: teal;speak: normal;">Update Employee</h1>
<frm:form modelAttribute="emp">

<table border="1" align="center" color="cyan">
<tr>
<td>Employee Number</td>
<td><frm:input path="empno" readonly="true"/>
</tr>

<tr>
<td>Employee Name</td>
<td><frm:input path="ename"/>
</tr>

<tr>
<td>Employee Desg</td>
<td><frm:input path="job"/>
</tr>

<tr>
<td>Employee Salary</td>
<td><frm:input path="sal"/>
</tr>

<tr>
<td>Employee Dept no </td>
<td><frm:input path="deptno"/>
</tr>

<tr>
<td><input type="submit" name="Update Employee"> &nbsp;
<input type="reset" name="cancel">
</td>
</tr>

</table>

</frm:form>
</body>
</html>