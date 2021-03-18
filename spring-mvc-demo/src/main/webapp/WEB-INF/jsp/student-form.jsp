<%--
  Created by IntelliJ IDEA.
  User: krish
  Date: 17/03/21
  Time: 8:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

    <form:form action="/student/processForm" modelAttribute="student">   <!-- modelAttribute should match whatever we've added in Controller class-->

        First Name <form:input path="fName" /> <!-- 'fName' -> property of Student class -->
        <br/>
        First Name <form:input path="lName" />

        <input type="submit" value="Sign Up" />

    </form:form>

</body>
</html>
