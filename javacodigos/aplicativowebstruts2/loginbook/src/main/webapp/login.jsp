<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Bookstore Login</title>
</head>
<body>
<h3>Login Bookstore</h3>
<s:actionerror />
<s:form action="login.action" method="post">
<s:textfield name="username" key="label.username" size="30" />
<s:password name="password" key="label.password" size="30" />
<s:submit method="execute" align="center" />
</s:form>
</body>
</html>