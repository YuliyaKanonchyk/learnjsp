<%@ page import="by.learnjsp.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calc</title>
</head>
<body>

<%=application.getAttribute("userList")%>
<%--<p><%if(true){--%>
<%--    out.print("Hello " );--%>
<%--}%>--%>
<%--</p>--%>
<form action="${pageContext.request.contextPath}/calc">
    <input type="text" name="num1">
    <br>
    <input type="text" name="num2">
    <br>
    <input type="text" name="type">
    <br>
    <button type="submit">Submit</button>
</form>
<p><%=request.getAttribute("result")%>
</p>
</body>
</html>
