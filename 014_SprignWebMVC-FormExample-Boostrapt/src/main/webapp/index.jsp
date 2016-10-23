<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
 
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<title>Anasayfa</title>
</head>
<body>
	<form id="userForm" name="userForm" method="post" action="listele.html">
<div class="form-group">
		<table>
			<tr>
				<td>Kullanıcı Adı :</td>
				<td><input type="text"  class="form-control" name="name" title=" Kullanıcı Adı"
					value="" /></td>

			</tr>

			<tr>
				<td>Kullanıcı Soyadı :</td>
				<td><input type="text"  class="form-control" name="surname"
					title=" Kullanıcı Soyadı" value="" /></td>

			</tr>

			<tr>
				<td>Kullanıcı E-Mail :</td>
				<td><input type="text"  class="form-control" name="email"
					title=" Kullanıcı Email" value="" /></td>
			</tr>

			<tr>
				<td></td>
				<td>
					<button type="submit" class="btn btn-default">Ekle</button>
					<button type="reset" class="btn btn-default">İptal</button>
				</td>
			</tr>
		</table>
</div>
	</form>
</body>
</html>








