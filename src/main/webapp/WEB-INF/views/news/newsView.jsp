<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<jsp:include page="../header.jsp"/>
<head>
    <title></title>
</head>
<body>
<jsp:include page="../navbar.jsp"/>


<table>
    <br/>
    <br/>
    <tr>
        <td align="center">${news.title}</td>
    </tr>

    <tr>
        <td  align="center">Author:${news.author}</td>
    </tr>

    <tr>
        <td  align="center">viewsAmount:${news.viewsAmount}</td>
    </tr>

    <tr>
        <td  align="center">${news.content}</td>
    </tr>


</table>

</body>
</html>