<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<jsp:include page="../header.jsp"/>
<body>
<jsp:include page="../navbar.jsp"/>

<div class="container">
    <br>

    <h3>news:</h3>
    <br>


    <div class="row">
        <div class="col-md-6">
            <label>Title</label>
            <text class="form-control" type="text"/>
            ${news.title}
        </div>
        <div class="col-md-2">
            <label>Views</label>
            <text class="form-control" type="text"/>
            ${news.viewsAmount}
        </div>

        <div class="col-md-4">
            <label>Author</label>
            <text class="form-control"/>
            ${news.author}
        </div>
    </div>
    <br/>

    <div class="row">
        <div class="col-md-12">
            <label>Content</label>
            <textarea maxlength="4096" rows="4" class="form-control" type="text"
                      name="content">${news.content}</textarea>
        </div>
    </div>

    <br>


</div>
</body>
</html>
<script src="${webappRoot}/resources/js/jquery-1.12.3.min.js"></script>








