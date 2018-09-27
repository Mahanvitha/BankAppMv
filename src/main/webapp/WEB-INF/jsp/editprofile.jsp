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
<h1>EditProfile</h1>
	<form:form action="editprofile.do" method="post" modelAttribute="customer">
		<br>
		<br>
		<form:label path="customerId">Customer Id: </form:label>
		<form:input type="number" path="customerId" readonly="readonly"/>
		<br><br>
		<form:label path="customerName">Customer Name: </form:label>
		<form:input type="text" path="customerName" placeholder="Enter your Name" required="required"/>
		<br>
		<br>
		<form:label path="customerPassword">Password: </form:label>
		<form:input type="password" path="customerPassword"  readonly="readonly"/>
		<br>
		<form:label path="customerEmail">Email Id: </form:label>
		<form:input type="email" path="customerEmail"  placeholder="Enter your Email" required="required"/>
		<br>
		<form:label path="customerAddress">Address: </form:label>
		<form:input type="text" path="customerAddress" placeholder="Enter your Address" required="required"/>
		<br>
		<form:label path="customerDateOfBirth">Customer Date Of Birth: </form:label>
		<form:input type="date" path="customerDateOfBirth" required="required"/>
		<br>
		<br>
		<br>
		<input type="submit" value="Login" />
	</form:form>
</body>
</html>