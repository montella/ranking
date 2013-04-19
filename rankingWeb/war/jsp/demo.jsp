<%@ page import="com.dc.ranking.model.*"%>
<%@ page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    
<!DOCTYPE html>
<html>

<head>
	<title>Demo</title>
</head>

<body>
	
	<h1>Lista de usuarios</h1>
	
	<c:forEach items="${users}" var="user">
		Nombre: <c:out value="${user.firstName}"/>, 
		Apellidos: <c:out value="${user.lastName}"/>, 
		Email: <c:out value="${user.email}"/>, 
		Password: <c:out value="${user.password}"/>
		<br/>
	</c:forEach>
	
</body>

</html>