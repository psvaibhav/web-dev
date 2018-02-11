<html>
<title> Declaration Test </title>
<body>
<%!
	String makeItLower(String text)	{
		return text.toLowerCase();
	}
%>
Lower case of SNAKE is <%=makeItLower("SNAKE") %>
</body>
</html>