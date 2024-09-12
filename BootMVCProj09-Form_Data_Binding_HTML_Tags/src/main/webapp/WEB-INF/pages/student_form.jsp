<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body style="background-image: url('images/col.jpeg');  background-repeat: no-repeat; width: 500px; height: 300px ">
<h1 style="color:red;text-align: center">Welcome Student Registration Page</h1>
<form action="register" method="post">
<table>
<tr>
<td> Student number</td>
<td><input type="text" name="sno"></td></tr>
<tr>
<td> Student name</td>
<td><input type="text" name="sname"></td></tr>
<tr>
<td> Student address</td>
<td><input type="text" name="addrs"></td></tr>
<tr>
<td> Student Average</td>
<td><input type="text" name="avg"></td>
</tr>
<tr>
<td><input type="submit"  name="Register"></td>
</tr>
</table>
</form>

</body>
</html>