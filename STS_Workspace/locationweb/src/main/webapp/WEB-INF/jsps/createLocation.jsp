<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Location</title>
</head>
<body>
	<pre>
		<form action="saveLoc" method="POST"> 
			Id:    <input type="text" name="id" />
			<br>
			Code:  <input type="text" name="code" />
			<br>
			Name:  <input type="text" name="name" />
			<br>
			Type:  Urban: <input type="radio" name="type" value="URBAN" />
			       Rural: <input type="radio" name="type" value="RURAL" />
		    <input type="submit"  value="save"/>
		</form>
	</pre>
	<p>
		${msg}
	</p>
	<p>
		<a href="displayLocations">View All</a>
		<br>
		<a href="generateReport">Generate Report</a>
	</p>
</body>
</html>