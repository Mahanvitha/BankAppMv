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
<h1>FundTransfer</h1>
<form action="transfer" method="post">
<label>From Account :</label>
<input type="number" value="${sessionScope.customer.customerAccount.accountId}" readonly name="fromAccount"/>
<br><br>
<label>To Account :</label>
<input type="number" name="toAccount"/>
<br><br>
<label>amount :</label>
<input type="number" name="amount"/>
<br><br>
<input type="submit" value="transfer"/>
</form>
</body>
</html>