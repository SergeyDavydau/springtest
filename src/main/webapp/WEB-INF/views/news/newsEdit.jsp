<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<html>
<jsp:include page="../header.jsp"/>
<body>
<jsp:include page="../navbar.jsp"/>

<div class="container">

    <h3>Add news:</h3>

    <form method="post" >
        <div class="row">
            <label>Title</label>
            <br/>
            <input type="text" name="title" value="${editNews.title}"/>
        </div>
        <br/>

        <div class="row">
            <label>Content</label>
            <br/>
            <input type="text" name="content" value="${editNews.content}"/>
        </div>
        <br/>
        <Table>
            <td style="padding-right: 40">
                <div class="row" margin=6>
                    <label>Author Name</label>
                    <br/>
                    <input type="text" name="first name" value="${authorName.firstName}"/>
                </div>
            </td>
            <td>
                <div class="row">
                    <label>Second Name</label>
                    <br/>
                    <input type="text" name="secondName" value="${authorName.secondName}"/>
                </div>
            </td>
        </Table>
        <button type="submit" value="Save">Save</button>
    </form>
</div>
</body>
</html>
<script src="${webappRoot}/resources/js/jquery-1.12.3.min.js"></script>