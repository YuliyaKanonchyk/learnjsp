<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/reg" method="post">
    <input type="text" name="login">
    <br>
    <input type="text" name="pass">
    <br>
    <button type="submit">Authorize</button>
</form>
</body>
</html>
