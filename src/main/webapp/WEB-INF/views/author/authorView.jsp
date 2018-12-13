<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../header.jsp"/>
<head>
    <title></title>
</head>
<body>
<jsp:include page="../navbar.jsp"/>
<div class="container">
    <h3>List of author:</h3>
    <table class="table">
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Second Name</td>
            <td>News</td>
            <td>
                <a title="AddAuthor" href="${DOMAIN}/author/add">
                    <span class="fa fa-plus"></span>
                </a>
            </td>
        </tr>

        <c:forEach items="${authorName}" var="author">

            <tr>

                <td>${author.id}</td>
                <td>${author.firstName}</td>
                <td>${author.secondName}</td>
                <td>${author.news}</td>
                <td>


                    <a title="EditAuthor"
                       href="${DOMAIN}/author/edit/${author.id}">
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
</div>
</body>
</html>