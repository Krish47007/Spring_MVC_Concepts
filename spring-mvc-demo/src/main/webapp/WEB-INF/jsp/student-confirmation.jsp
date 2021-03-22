<%--
  Created by IntelliJ IDEA.
  User: krish
  Date: 17/03/21
  Time: 8:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

    Welcome : ${student.fName} ${student.lName} <br>
    Country : ${student.country} <br />
    Favourite Programming Language : ${student.favProgrammingLang} <br />
    Operating Systems: <br/>
    <ul>
        <c:forEach var="os" items="${student.operatingSystems}" >
            <li> ${os} </li>
        </c:forEach>
    </ul>

</body>
</html>
