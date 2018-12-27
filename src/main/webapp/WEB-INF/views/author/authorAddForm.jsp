
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../header.jsp"/>
<head>
    <title>Add Author</title>
</head>
<body>
<jsp:include page="../navbar.jsp"/>
<br>
<div class="container">
    <form method="Post">
        <table>
            <tr>
                <td></td>
                <div class="row" margin=6>
                    <label>Author Name</label>
                    <br/>
                    <input type="text" name="firstName" />
                </div>
                </td>
            </tr>
            <tr>
                <td>
                    <div class="row">
                        <label>Second Name</label>
                        <br/>
                        <input type="text" name="secondName"/>
                    </div>
                </td>
            </tr>
        </table>
        <button type="submit" value="Save">Save</button>
    </form>
</div>
</body>
</html>