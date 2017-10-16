<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <h1>List</h1>
    <c:forEach items="${deviceList}" var = "device" >
        <hr>
            <td>${device.id}</td>
            <td>${device.name}</td>
            <td>${device.location}</td>

        </hr>
    </c:forEach>
</body>
</html>
