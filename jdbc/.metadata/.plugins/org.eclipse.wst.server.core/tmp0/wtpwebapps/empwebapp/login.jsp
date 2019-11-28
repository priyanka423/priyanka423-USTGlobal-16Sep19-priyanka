<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>


<%
	String id = "";
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}

		}
	}
%>
<body>
<h4><%=msg %></h4>
	<fieldset align='center'>
		<legend align='center'>Login</legend>
		<form action='./login' method='post'>
			<table align='center'>
				<tr>
					<td>Login-id:</td>
					<td><input type='number' name='id' value='<%=id%>'></td>
				</tr>
				<tr>
					<td>Login-password:</td>
					<td><input type='password' name='password'></td>
				</tr>
				<tr>
					<td>Remember Me</td>
					<td><input type='checkbox' value='checked' name='rememberme'></td>
				</tr>
				<tr>
					<td><input type='submit' value='Login'></td>
					<td><input type='reset' value='reset'></td>
				</tr>
				<tr>
					<td><a href='./register.html'>Register</a></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>