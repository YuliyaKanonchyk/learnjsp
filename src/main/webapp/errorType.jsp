<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>ErrorType</title>
</head>
<body>
<p style="color: red"><%=exception.getMessage()%></p>
<a href="${pageContext.request.contextPath}/main">На главную</a>
</body>
</html>
