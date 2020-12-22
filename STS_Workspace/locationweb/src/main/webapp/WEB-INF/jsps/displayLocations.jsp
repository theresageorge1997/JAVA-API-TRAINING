<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Locations List</title>
</head>
<body>
	<h2>Locaitons:</h2>
	<table width="400" border="1" cellpadding="3">
		<tr>
			<th>Id</th>
			<th>Code</th>
			<th>Name</th>
			<th>Type</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		<c:forEach items="${locations}" var="location">
			<tr>
				<td>${location.id}</td>
				<td>${location.code}</td>
				<td>${location.name}</td>
				<td>${location.type}</td>
				<td><a href="deleteLocation?id=${location.id}">Delete</a></td>
				<td><a href="showUpdate?id=${location.id}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="showCreate">Add a Location</a>
</body>
</html>