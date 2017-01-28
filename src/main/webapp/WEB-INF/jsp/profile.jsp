<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Profile</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
Users

<table>
    <tr>
        <th>Name</th>
        <th>Login</th>
    </tr>
    <c:forEach items="${sessionScope.users}" var="user">
        <tr>
            <td>${user.firstName}</td>
            <td>${user.login}</td>
        </tr>

    </c:forEach>
</table>

</body>

</html>
