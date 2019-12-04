<%@page language="java" contentType="text/html"%>

<p>Book Title: ${param.bookTitle}<br>
Author 1: ${paramValues.authorName[0]}<br>
Author 2: ${paramValues. authorName[1]}

<span>${header["user-agent"]}</span>
</p>
