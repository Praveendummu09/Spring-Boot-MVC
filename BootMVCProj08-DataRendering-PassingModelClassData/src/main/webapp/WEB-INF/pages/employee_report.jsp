<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h1 style="color:red;text-align:center">Welcome Employee Data Page</h1>
<br><br><br>
<%-- <c:if test="${!empty employee}" >
<b>Model class Object as a Model Attribute value :: ${employee}</b>
</c:if> --%>

<c:if test="${!empty employee}">
Model class Object as a Model Attribute value Using another way :: ${employee.eno},${employee.ename},${employee.salary},${employee.vaccination}.
</c:if>
