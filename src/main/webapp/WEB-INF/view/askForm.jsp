<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ilia
  Date: 26/01/2023
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1>Please enter your info below:</h1>
    <br>
    <br>
    <%--    <form action="show" method="get">--%>
    <%--        <input type="text" name="employeeName"--%>
    <%--               placeholder="Enter your name">--%>
    <%--        <input type="submit"/>--%>

    <%--    </form>--%>

    <form:form action="show" modelAttribute="employee">

        Name <form:input path="name"/>
        <br><br>
        Surname <from:input path="surname"/>
        <br><br>
        Salary <from:input path="salary"/>
        <br><br>
        Department <from:input path="department"/>
        <input type="submit" value="send"/>

    </form:form>


</head>
<body>

</body>
</html>
