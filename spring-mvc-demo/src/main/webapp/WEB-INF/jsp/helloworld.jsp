<%--
  Created by IntelliJ IDEA.
  User: krish
  Date: 14/03/21
  Time: 12:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloWorld</title>
</head>
<body>
    <h1>HelloWorld from Spring MVC!!!</h1>
    <br/>
    <h4>Welcome : ${param.userName}</h4>
    <br />
    <h2>The message : ${message}</h2>
    <img src="${pageContext.request.contextPath}/resources/images/test">
</body>
</html>
