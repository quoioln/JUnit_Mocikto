<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Login</title>
</head>
<body>
	<s:form action="loginprocess">
		<s:textfield name="fullname" label="User Name"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:submit value="Login !!!!!"></s:submit>
	</s:form>
	<a href="register">Register</a>
</body>
</html>