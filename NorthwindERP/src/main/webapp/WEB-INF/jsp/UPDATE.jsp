<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Update</title>
</head>
<body>
	<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>
	<p><strong>Update Here | <a href="../read">Click for Read</a></strong></p>
<form method="POST" action="/update" >
<pre>
<c:forEach var="listValue" items="${employee_detail}">
		
Id:    	<input type="text" name="emp_id" value="${listValue.id}" disabled="disabled"/>
		<input type="hidden" name="id" value="${listValue.name}"/>			
Name:  	<input type="text" name="name" value="${listValue.department}" />
		
Email: 	<input type="text" name="email" value="${listValue.designation}" />
	    
Course:	<input type="text" name="course" value="${listValue.email}" />
Course:	<input type="text" name="course" value="${listValue.mobile}" />
		    
        <input type="submit" value="Update" />	
</c:forEach>	

<input type="submit" value="Update" />	
</pre>
</form>

</body>
</html>


<!--  

		<c:if test="${not empty employee_detail}">

			<c:forEach var="listValue" items="${employee_detail}">

				<table width="385">
					<tr>
						<td width="186">Name</td>
						<td><input type="text" name="emp_id" size="20"
							value=<c:out value="${listValue.id}"/>></td>
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


















						</c:forEach>

						</c:if>


-->

