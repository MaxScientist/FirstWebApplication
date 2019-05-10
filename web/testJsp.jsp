<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 08.05.2019
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Testing JSP</h1>
<p>
        <%@ page import="java.lang.Thread"%>
    <%
        String name =request.getParameter("id");
        out.println("<center><h1 style=size:42px>"+ name+"</h1></center>");
    %>
</p>
</body>
</html>
