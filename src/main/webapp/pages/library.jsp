
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http:java.sun.com/jsp/jstl/core" %>
<body>
<head>
    <title>Library</title>
</head>
<body>
<h1>Library ${library.name}</h1>
<h2>${library.address}</h2>
<h1>Books:</h1>
<table border="1">
    <tr>
        <th>Title</th>
        <th>Pages</th>

    </tr>
    <c:forEach var="bool" items="${library.books}">
        <tr>
            <td></td>
            <td></td>
        </tr>
    </c:forEach>

</table>
</head>
</html>
