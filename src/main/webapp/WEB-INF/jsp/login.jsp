<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
${sessionScope.error}
<form action="./login" method="post">
    <input type="text" name="login"/>
    <br>
    <input type="password" name="password"/>
    <br>
    <input type="submit" value="Login"/>
</form>

</body>
</html>
