<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Location</title>
</head>
<body>
	<pre>
		<form action="updateLoc" method="POST"> 
			Id:    <input type="text" name="id" value="${location.id}" readonly/>
			<br>
			Code:  <input type="text" name="code" value="${location.code}"/>
			<br>
			Name:  <input type="text" name="name" value="${location.name}"/>
			<br>
			Type:  Urban: <input type="radio" name="type" value="URBAN" ${location.type=='URBAN' ? 'checked' : ''} />
			       Rural: <input type="radio" name="type" value="RURAL" ${location.type=='RURAL' ? 'checked' : ''}  />
		    <input type="submit"  value="save"/>
		</form>
	</pre>
	<p>
		${msg}
	</p>
	<p>
		<a href="displayLocations">View All</a>
	</p>
</body>
</html>