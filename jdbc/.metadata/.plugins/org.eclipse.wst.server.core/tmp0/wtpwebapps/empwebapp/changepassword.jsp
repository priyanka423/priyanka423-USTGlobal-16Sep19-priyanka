<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request" />
<body>
	<a href="./home">Home</a>
	<a href="./logout">Logout</a>
	<h4><%=msg %></h4>
	<fieldset align="center"></fieldset>
	<legend align="center">Change Password</legend>
	<form action="./changepassword" method="post">
		<table align="center">
			<tr>
				<td>New-Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Confirm-password:</td>
				<td><input type="text" name="confirmpassword"></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="change password"></td>
			</tr>
		</table>
	</form>
	</fieldset>
</body>
</html>