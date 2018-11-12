<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${webappRoot}../../resources/css/bootstrap.min.css" rel="stylesheet" media="screen"/>
    <title>Error</title>
</head>
<body>
<table class="table">
    <tr>
        <th>Id</th>
        <th>Title</th>
        <th>Content</th>
    </tr>
    <tr>
        <td>${records[0].id}</td>
        <td>${records[0].title}</td>
        <td>${records[0].content}</td>
    </tr>
    <tr>
        <td>${records[1].id}</td>
        <td>${records[1].title}</td>
        <td>${records[1].content}</td>
    </tr>
</table>



</body>
</html>
<script src="../../resources/js/jquery-1.12.3.min.js"></script>