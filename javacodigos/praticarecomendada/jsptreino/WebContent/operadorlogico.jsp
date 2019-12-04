<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<td><b>Logical Operator</b></td>
<td><b>Result</b></td>
</tr>
<tr>
<td>${'${'}true && false}</td>
<td>${true && false}</td>
</tr>
<tr>
<td>${'${'}true || false}</td>
<td>${true || false}</td>
</tr>
<tr>
<td>${'${'}not true}</td>
<td>${not true}</td>
</tr>
</table>
</body>
</html>