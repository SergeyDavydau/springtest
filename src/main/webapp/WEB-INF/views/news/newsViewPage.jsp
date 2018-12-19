
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
    <tr>${readNews.title}</tr>
    <tr>${readNews.author}</tr>
    <tr>${readNews.content}</tr>
</table>

</body>
</html>