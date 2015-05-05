<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:forEach items="#{beers}" var="beer">
    <h3><a href="<c:url value="/beer/1"/>">${beer}</a></h3>
</c:forEach>
</body>
</html>
