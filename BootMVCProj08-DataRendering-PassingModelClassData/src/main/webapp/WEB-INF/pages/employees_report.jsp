<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h1 style="color:red;text-align:center">Welcome Employee Data Page</h1>
<br><br><br>
<c:choose>
<c:when test="${!empty emps}">
Employee detsils ::<br>
<table border="2" bgcolor="cyan" align="center">
<tr><th>enum</th><th>ename</th><th>salary</th><th>Vaccinated</th></tr>
<c:forEach var="emp" items="${emps}">
<tr>
<td>${emp.eno}</td>
<td>${emp.ename}</td>
<td>${emp.salary}</td>
<td>${emp.vaccination}</td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align: center">Employees records not found</h1>
</c:otherwise>

</c:choose>
