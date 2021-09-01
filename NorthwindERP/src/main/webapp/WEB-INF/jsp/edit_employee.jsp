
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>

<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1252">
<title>Home page</title>
<style type="text/css">
table {
	border-collapse: collapse;
	font-size: 14px;
	font-family: "calibri", Times, serif;
	margin-left: auto;
	margin-right: auto;
}

th {
	font-weight: bold;
	text-align: center;
	background-color: #C1C9AF;
	border: 1px solid #616161;
	padding: 5px;
}

td {
	border: 1px solid #ccc;
	padding: 5px;
	text-align: left;
}

tr:nth-child(even) {
	background-color: #fff;
}

tr:nth-child(odd) {
	background-color: #fff;
}
</style>
</head>
<p align="center">
	<font size="6" color="#008000">Edit Employee</font>
</p>
<hr>





<body>
	<p align="right">
		<a href="logout">LogOut</a><br>

	</p>

	<form method="POST" action="/update">









		<c:if test="${not empty employee_detail}">

			<c:forEach var="listValue" items="${employee_detail}">

				<table width="385">
					<tr>
						<td width="186">Name</td>
						<td><input type="text" name="emp_id" size="20"
							value=<c:out value="${listValue.id}"  />></td>
					</tr>
					<tr>
						<td width="186">Name</td>
						<td><input type="text" name="name" size="20"
							value=<c:out value="${listValue.name}" />></td>
					</tr>
					<tr>
						<td width="186">Department</td>
						<td><input type="text" name="department" size="20"
							value=<c:out value="${listValue.department}" />></td>
					</tr>
					<tr>
						<td width="186">Designation</td>
						<td><input type="text" name="designation" size="20"
							value=<c:out value="${listValue.designation}" />></td>
					</tr>
					<tr>
						<td width="186">Email</td>
						<td><input type="text" name="email" size="20"
							value=<c:out value="${listValue.email}" />></td>
					</tr>
					<tr>
						<td width="186">mobile</td>
						<td><input type="text" name="mobile" size="20"
							value=<c:out value="${listValue.mobile}" />></td>
					</tr>
					<tr>


















						<td colspan="2">
							<p style="text-align: center">
								<input type="submit" value="UPDATE" name="B1">
						</td>


						</c:forEach>

						</c:if>




					</tr>
				</table>
	</form>


</body>
</html>