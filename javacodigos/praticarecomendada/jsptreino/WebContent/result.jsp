<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>


<!DOCTYPE html >
<html>
<body>
<p>Book Title: ${param.bookTitle}<br>
Author 1: ${paramValues.authorName[0]}<br>
Author 2: ${paramValues. authorName[1]}


</p>
<span>${header["user-agent"]}</span>

</body>
</html>