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
    <form method="post">
        <Table>
            <tr style=padding-right:40px>
                <div class="row" margin=6>
                    <label>Author Name</label>
                    <input type="hidden" name="id" value="${authorName.id}"/>
                    <br/>
                    <input type="text" name="firstName" value="${authorName.firstName}"/>
                </div>
            </tr>
            <tr>
                <div class="row">
                    <label>Second Name</label>
                    <br/>
                    <input type="text" name="secondName" value="${authorName.secondName}"/>
                </div>
            </tr>
            <td>

                <tr>
                    <div class="col-md-4">
                        <label>Author</label>
                        <select class="form-control" name="news">
                            <option></option>

                            <c:forEach items="${options.news}" var="opt">
                                <option value="${opt.id}" <c:if
                                        test="${authorName.news.id == opt.id}"> selected </c:if>>
                                        ${opt}
                                </option>
                            </c:forEach>
                        </select>
                    </div>
                </tr>
        </Table>
        <button type="submit" value="Save">Save</button>
    </form>
</div>
</body>
</html>