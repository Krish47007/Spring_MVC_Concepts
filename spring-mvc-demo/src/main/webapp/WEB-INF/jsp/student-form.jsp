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
        <br />
        <!-- Label is the drop down that user will see and value is the actual code for that
        label that will be passed in backend-->
        Country 
        <form:select path="country">
            <%--<form:option value="IND" label="INDIA" />
            <form:option value="AUS" label="AUSTRALIA" />
            <form:option value="US" label="UNITED STATES" />
            <form:option value="NZ" label="NEW ZEALAND" />--%>
            <form:options items="${theCountryOptions}" />
        </form:select>
        <br />

        Favourite programming language :
        Java<form:radiobutton path="favProgrammingLang" value="Java" />
        C++<form:radiobutton path="favProgrammingLang" value="C++" />
        C<form:radiobutton path="favProgrammingLang" value="C" />
        Python<form:radiobutton path="favProgrammingLang" value="Python" />
        <br />

        <input type="submit" value="Sign Up" />

    </form:form>

</body>
</html>
