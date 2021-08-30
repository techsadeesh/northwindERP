<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1252">
<title>Home page</title>
<link rel="stylesheet" href="mystyle.css">
</head>
<p align="center">
	<font size="6" color="#008000">North-Wind Trading Company</font>
</p>
<hr>
<body>
<p align="right"><a href="home">Home</a><br>

<form method="POST" action="addItem">
	<div align="center">
	<table border="0" width="25%" style="border-collapse: collapse">
		<tr>
			<td>Employee Id</td>
			<td width="148"><input type="text" name="emp_id" size="20"></td>
		</tr>
		<tr>
			<td>Name</td>
			<td width="148"><input type="text" name="name" size="20"></td>
		</tr>
		<tr>
			<td>Department</td>
			<td width="148"><input type="text" name="department" size="20"></td>
		</tr>
		<tr>
			<td>Designation</td>
			<td width="148"><input type="text" name="designation" size="20"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td width="148"><input type="text" name="email" size="20"></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td width="148"><input type="text" name="mobile" size="20"></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td width="148">&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2">
			<p align="center"><input type="submit" value="Submit" name="B1"></td>
		</tr>
	</table>
</div></form>

 
</body>

</html>