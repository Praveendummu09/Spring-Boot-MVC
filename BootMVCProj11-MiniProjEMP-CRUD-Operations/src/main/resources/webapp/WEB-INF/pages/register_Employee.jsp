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
<frm:form modelAttribute="emp">
<table align="center" bgcolor="gray">
<tr>
<td>Employee Name::</td>
<td><frm:input path="ename"></frm:input></td>
</tr>
<tr>
<td>Employee Desg::</td>
<td><frm:input path="job"></frm:input></td>
</tr>
<tr>
<td>Employee Sal::</td>
<td><frm:input path="sal"></frm:input></td>
</tr>
<tr>
<td>Employee deptno::</td>
<td><frm:input path="deptno"></frm:input></td>
</tr>
<tr>
<td><input type="submit" name="submit"></td>
<td><input type="reset" name="Cancel"></td>
</tr>
</table>
</frm:form>


</body>
</html>