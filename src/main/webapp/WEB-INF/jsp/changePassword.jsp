
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="home.jsp"%>
</head>
<body>
	<h1>ChangePassword</h1>
	<form action="changePassword.do" method="post">
		<label>Customer Old Password:</label> 
		<input type="password" name="oldPassword" placeholder="Enter your old password" required="required" />
		 <br>
		  <label>Customer New Password:</label>
		   <input type="password" name="newPassword" placeholder="Enter your new password" required="required" />
		<br> <br> 
	 <input type="submit" value="Login" />
	</form>
</body>
</html>