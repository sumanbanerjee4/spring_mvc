<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome</title>
    <title>Guru Registration Form</title>
</head>
<body>
<h1>Student Register Form</h1>
<form action="student_register" method="post" >
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				<tr>
					<td>Subject</td>
					<td><input type="text" name="subject" /></td>
				</tr>
					<tr>
					<td>Standard</td>
					<td><input type="text" name="standard" /></td>
				</tr>
				<tr>
					<td>Board</td>
					<td><input type="text" name="board" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr></table>
			<input type="submit" value="Submit" /></form>
</body>
</html>