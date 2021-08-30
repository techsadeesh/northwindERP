<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1252">
<title>Home page</title>

<link rel="stylesheet" href="mystyle.css">

<script type="text/javascript">
	function LoadByName(windowHeight, windowWidth, val) {

		var centerWidth = (window.screen.width - windowWidth) / 2;
		var centerHeight = (window.screen.height - windowHeight) / 2;
	
		newWindow = window.open('/EditEmployee/' + val,
				'mywindow', 'resizable=0,width=' + windowWidth + ',height='
						+ windowHeight + ',left=' + centerWidth + ',top='
						+ centerHeight);
	
		/*
		newWindow = window.open('/EditEmployee',
				'mywindow', 'resizable=0,width=' + windowWidth + ',height='
						+ windowHeight + ',left=' + centerWidth + ',top='
						+ centerHeight);
		*/
		newWindow.divHiding(1);
		newWindow.focus();
	}
</script>





</head>
<p align="center">
	<font size="6" color="#008000">North-Wind Trading Company</font>
</p>
<hr>
<body>
	<p align="right">
		<a href="logout">LogOut</a><br>

	</p>


	<table class=center>

		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Email</th>
			<th>Mobile</th>
<th>Edit</th>
			<th>Delete</th>




		</tr>



		<c:if test="${not empty lists}">

			<c:forEach var="listValue" items="${lists}">


				<tr>
					<td><c:out value="${listValue.id}" /></td>
					<td><c:out value="${listValue.name}" /></td>
					<td><c:out value="${listValue.department}" /></td>
					<td><c:out value="${listValue.designation}" /></td>
					<td><c:out value="${listValue.email}" /></td>
					<td><c:out value="${listValue.mobile}" /></td>

					<td><button	onclick="LoadByName(600,600,'${listValue.id}')">Edit</button> </a></td>
					<td><button	onclick="LoadByName(600,600,'${listValue.id}')">Delete</button> </a></td>

				</tr>
			</c:forEach>

		</c:if>

	</table>








</body>

</html>