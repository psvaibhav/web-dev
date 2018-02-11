<html>
<title> Student Confirmation Title </title>
<body>
	The student is confirmed: ${param.firstName} ${param.lastName}
	<br>
	The student's country: ${param.country}
	<br><br>
	The student is confirmed: <%= request.getParameter("firstName") %> <%= request.getParameter("lastName") %>
	<br>	
	The student's country: <%= request.getParameter("country") %>
</body>
</html>