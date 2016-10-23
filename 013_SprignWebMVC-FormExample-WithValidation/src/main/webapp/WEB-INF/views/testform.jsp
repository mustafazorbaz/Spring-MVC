<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<form:form action="testform.html" commandName="user">

		<table>
			<tr>
				<td>Came To User Name :</td>
				<td><form:input path="name" /><font color="red"><form:errors
							path="name" /></font></td>
			</tr>

			<tr>
				<td>Came To Surname:</td>
				<td><form:input path="surname" /> <font color="red"><form:errors
							path="surname" /> </font></td>
			</tr>

			<tr>
				<td>Came To Email:</td>
				<td><form:input path="email" /> <font color="red"><form:errors
							path="email" /> </font></td>
			</tr>

			<tr>
				<td>Come To Password</td>
				<td><form:input path="parola" /> <font color="red"><form:errors
							path="parola" /> </font></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Gönder" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>