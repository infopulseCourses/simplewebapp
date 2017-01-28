<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>

<body>
${sessionScope.error}
<form action="/registration" method="post">
    <input type="text" name="firstName"/>
    <br>
    <input type="text" name="login"/>
    <br>
    <input type="password" name="password"/>
    <br>
    <input type="submit" value="Register"/>
</form>

</body>
</html>
