<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<jsp:include page="../header.jsp"/>
<body>
<jsp:include page="../navbar.jsp"/>

<div class="container">

    <h3>Add news:</h3>

    <form method="post">
        <table>
            <tr>
                <div class="row">

                    <td><label>Title</label></td>
                    <br/>

                    <td><input type="text" name="title" value="${editNews.title}"/></td>
                </div>
                <br/>
            </tr>
            <tr>
                <div class="row">
                    <td><label>Content</label></td>
                    <br/>
                    <td><input type="text" name="content" value="${editNews.content}"/></td>
                </div>
                <br/>


            </tr>
            <td>
                <button type="submit" value="Save">Save</button>
            </td>
        </table>
    </form>
</div>
</body>
</html>
<script src="${webappRoot}/resources/js/jquery-1.12.3.min.js"></script>