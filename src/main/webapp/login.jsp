<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is login page</h1>
	<form action="login" method="post">
		<table>
			<tr>
				<td>User name :</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input name='password' type='password'></td>
			</tr>
			<tr>
				<td><input name='submit' type='submit' value='submit'></td>
			</tr>
		</table>
	</form>
</body>
</html>