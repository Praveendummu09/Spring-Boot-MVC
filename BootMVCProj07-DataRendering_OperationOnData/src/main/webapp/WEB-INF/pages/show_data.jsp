<%@ page language="java"  isELIgnored="false" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h1 style="text-align:center;color:Green">Welcome to this page</h1>

<%-- <h2 style="text-align:center;color:blue">Data is :: ${Name}, ${id}</h2> --%>
    
    <%-- <h2 style="text-align:center;color:blue">Subjects are :: ${Subject}</h2> --%>
   <%--  <h2 style="text-align:center;color:blue">Subjects are:: <%= Arrays.toString((String[]) request.getAttribute("Subject")) %></h2>
    <h2 style="text-align:center;color:blue">Branches are :: ${Branch}</h2>
    <h2 style="text-align:center;color:blue">Id are :: ${id}</h2>
    <h2 style="text-align:center;color:blue">Details is :: ${details} </h2> --%>
    
<%-- Using jstl(jsp standard tag lib) --%>

<h1>Model Attribute Data</h1><br>
<h2>Subject Names</h2>
<c:if test="${!empty Subject}">
<c:forEach var="sub" items="${Subject}">
${sub},
</c:forEach>
</c:if><br>
<h2>Branches are ::</h2>
<c:if test="${!empty Branch}">
<c:forEach var="bran" items="${Branch}">
${bran},
</c:forEach>
</c:if><br>
<h2>Id are ::</h2>
<c:if test="${!empty id}">
<c:forEach var="ids" items="${id}">${ids},</c:forEach>
</c:if><br>

<h2>Details are ::</h2>
<c:if test="${!empty details}">
<c:forEach var="data" items="${details}">${data.key}=${data.value},</c:forEach></c:if>.



