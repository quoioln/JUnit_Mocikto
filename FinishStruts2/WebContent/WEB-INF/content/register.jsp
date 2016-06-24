<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Register</title>
</head>
<body>
	<s:form action="registerprocess">
		<s:textfield name="fullname" label="UserName"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:radio list="{'male','female'}" name="gender"></s:radio>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:select cssStyle="width:155px;" list="{'VIETNAM','ENGLAND','JAPANESE', 'OTHER'}"
			name="country" label="Country"></s:select>

		<s:submit value="Register"></s:submit>

	</s:form>
</body>
</html>