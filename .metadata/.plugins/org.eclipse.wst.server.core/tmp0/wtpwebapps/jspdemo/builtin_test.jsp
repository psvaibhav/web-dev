<%@ page import="java.util.*" %>
<html>
<body>
<h3> JSP Built-In Objects </h3>
Request user agent: <%= request.getHeader("User-Agent") %>
<br><br>
Request locale: <%= request.getLocale() %>
<br><br>
Request protocol: <%= request.getProtocol() %>
<br><br>
Request headers: 
<% 
	for (String header : Collections.list(request.getHeaderNames()))
	{
	    out.println("<br>[" + header + "]");
	}
%>
</body>
</html>