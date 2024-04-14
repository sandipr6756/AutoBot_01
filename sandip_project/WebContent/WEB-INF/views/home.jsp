<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
Welcome , ${sesuser}


<table border="1">
<tr><th>Id</th><th>FullName</th><th>City</th><th>State</th><th>DOB</th><th>Email</th><th>Password</th><th>Phone</th><th>Address</th><th>Gender</th><th>Delete</th><th>Edit</th>

<c:forEach var="emp" items="${list}">
	<tr><td>${emp.id}</td><td>${emp.fullname}</td><td>${emp.city}</td><td>${emp.state}</td><td>${emp.dob}</td><td>${emp.email}</td><td>${emp.password}</td><td>${emp.phone}</td><td>${emp.address}</td><td>${emp.gender}</td><td><button><a href="delete/${emp.id}">Delete</button></td><td><button><a href="edit/${emp.id}">Edit</button></td></tr>
</c:forEach>
</table>
</body>
</html>