<%@ page language="java" contentType="text/html; charset=UTF-8"
   isELIgnored="false" pageEncoding="UTF-8"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css" >
<script type="text/javascript" src="js/validation.js"></script>
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align: center;color: teal;speak: normal;">Update Employee</h1>
<frm:form modelAttribute="emp" onsubmit="return doValidation(this)">
<frm:hidden path="vflag"/>
<table border="1" align="center" color="cyan">
<tr>
<td>Employee Number</td>
<td><frm:input path="empno" readonly="true"/>
</tr>

<tr>
<td>Employee Name</td>
<td><frm:input path="ename"/><frm:errors path="ename" /><span id="enameErr"></span>
</tr>

<tr>
<td>Employee Desg</td>
<td><frm:input path="job"/><frm:errors path="job" /><span id="jobErr"></span>
</tr>

<tr>
<td>Employee Salary</td>
<td><frm:input path="sal"/><frm:errors path="sal" /><span id="salErr"></span>
</tr>

<tr>
<td>Employee Dept no </td>
<td><frm:input path="deptno"/><frm:errors path="deptno" /><span id="deptnoErr"></span>
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