<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<jsp:include page="../header.jsp"/>
<body>
<jsp:include page="../navbar.jsp"/>

<div class="container">

	<h3>Add news:</h3>
	<form method="post" action="">
		<div class="row">
			<label>Title</label>
			<br/>
			<input type="text" name="title"/>
		</div>
		<br/>
		<div class="row">
			<label>Content</label>
			<br/>
			<input type="text" name="content"/>
		</div>
		<br/>
		<button type="submit" value="Save">Save</button>
	</form>
</div>
</body>
</html>
<script src="${webappRoot}/resources/js/jquery-1.12.3.min.js"></script>