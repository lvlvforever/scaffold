<%--
  Created by IntelliJ IDEA.
  User: daipeng
  Date: 2018/8/24
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach items="${list}" var="user">
        <li><c:out value="${user.name}"></c:out></li>
    </c:forEach>
</ul>


</body>
</html>
