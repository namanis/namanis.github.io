<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your Book store</title>
</head>
<body>
<h1>Add Book</h1>
<form:form  method="post"  modelAttribute="book">
Author<br/>
<form:select path="author">
<form:options items="${authorList}" itemValue="authorId" itemLabel="authorNome" />
</form:select>
<br/><br/>
Book Name<br/>

<form:input path="bookTitle" />
<form:errors path="bookTitle" cssClass="error" />
<br/><br />
<br/>
<input type="submit" value="Submit">
</form:form>
</body>
</html>










