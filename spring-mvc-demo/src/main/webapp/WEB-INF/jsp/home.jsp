<%--
  Created by IntelliJ IDEA.
  User: krish
  Date: 14/03/21
  Time: 12:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring-MVC</title>
</head>
<body>
    <h1>Welcome to Spring MVC!!!</h1>
    <hr />
    <br/>
    <a href="/hello/show">Let's go inside</a>
    <br />
    <a href="/student/showForm">Student Form</a>
    <br />
    <a href="/customer/showForm">Customer Form</a>
    <br />
    <br />
    <a style="cursor: pointer" onclick="javascript: window.location = '/customer/showForm';">New Customer Form</a>

</body>
</html>
