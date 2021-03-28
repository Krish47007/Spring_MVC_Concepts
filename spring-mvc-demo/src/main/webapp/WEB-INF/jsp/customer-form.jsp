<%--
  Created by IntelliJ IDEA.
  User: krish
  Date: 23/03/21
  Time: 8:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="for" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Customer Registration Form</title>

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/customer-form.css">    <!-- pageContext.request.contextPath to access the correct root directory for your web application.-->
</head>
<body>
    <b>Please fill out the form. All fields marked with asterisk(*) are mandatory</b>
    <br />
    <br />
    <form:form action="/customer/processForm" modelAttribute="customer">
        First Name <form:input path="firstName" />
        <br />
        Last Name<sup style="color: red">*</sup> <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error" />
        <br />
        Free Passes<sup style="color: red">*</sup> <form:input path="freePasses" />
        <form:errors path="freePasses" cssClass="error" />
        <br />
        Pincode <form:input path="pincode" />
        <for:errors path="pincode" cssClass="error" />
        <br />
        Course Code <form:input path="courseCode" />
        <form:errors path="courseCode" cssClass="error" />
        <br />
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
