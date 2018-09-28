<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%><!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file= "home.jsp" %>
</head>
<body>
<h1>CheckBalance</h1>
	<form:form action="checkBalance.do" method="post" modelAttribute="customer">
		<br><br><br><br><br>
<h3>${balance}</h3>	
	</form:form>
</body>
</html>