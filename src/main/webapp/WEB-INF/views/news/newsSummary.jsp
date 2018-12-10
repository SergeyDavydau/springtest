<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<html>
<jsp:include page="../header.jsp"/>
<body>
<jsp:include page="../navbar.jsp"/>
<div class="container">

    <h3>List of news:</h3>

    <table class="table">
        <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Content</th>

            <th>
                <a title="Add" href="${DOMAIN}/news/add">
                    <span class="fa fa-plus"></span>
                </a>
            </th>
        </tr>

        <c:forEach items="${recordsList}" var="record">
            <tr>
                <td>${record.id}</td>
                <td>${record.title}</td>
                <td>${record.content}</td>

                <td>


                        <%-- TODO: СДЕЛАЙ ЧТОБЫ РАБОТАЛО РЕДАКТИРОВАНИЕ--%>
                    <a title="Edit"
                       href="${DOMAIN}/news/newsEdit/${record.id}">
                        <span class="fa fa-pencil"> </span>
                    </a>

                        <%-- TODO: СДЕЛАЙ ЧТОБЫ РАБОТАЛО УДАЛЕНИЕ (вызов в коде снизу)--%>
                    <a title="Delete"
                       href="${DOMAIN}/news/delete/${record.id}"
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
<script src="${webappRoot}/resources/js/jquery-1.12.3.min.js"></script>