<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../header.jsp"/>
<head>
    <title></title>
</head>
<body>
<table class="table">
    <tr>
        <td>AUTHOR ID</td>
        <td>AUTHOR NAME</td>
        <td>AUTHOR SECONDNAME</td>
        <td>
            <a title="AddAuthor" href="${DOMAIN}/author/authorAdd">
                <span class="fa fa-plus"></span>
            </a>
        </td>
    </tr>

    <c:forEach items="${authorName}" var="author">

        <tr>

            <td >${author.id}</td>
            <td >${author.firstName}</td>
            <td >${author.secondsName}</td>
            <td>


                <a title="EditAuthor"
                   href="${DOMAIN}/author/authorEdit/${author.id}">
                    <span class="fa fa-pencil"> </span>
                </a>
                <a title="DeleteAuthor"
                   href="${DOMAIN}/author/delete/${author.id}"
                   onclick="return confirm('Are you sure you want to delete record?')">
                    <span class="fa fa-trash"> </span>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>