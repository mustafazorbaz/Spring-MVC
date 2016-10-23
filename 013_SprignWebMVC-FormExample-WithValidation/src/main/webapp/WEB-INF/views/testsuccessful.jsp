<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successful  Result</title>
</head>
<body>
 <table>
      <tr>
        <td>Came To User Name : </td>   
        <td><c:out value="${user.name}"/></td> 
      </tr>
  
  		<tr>
        <td>Came To Surname: </td>    
        <td><c:out value="${user.surname}"/></td> 
      </tr>
  
      <tr>
        <td>Came To Email: </td>    
        <td><c:out value="${user.email}"/></td> 
      </tr> 
      
       <tr>
        <td>Come To Password </td>    
        <td><c:out value="${user.parola}"/></td> 
      </tr> 
        
  </table>
</body>
</html>