<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<link href="${webappRoot}../../resources/css/bootstrap.min.css" rel="stylesheet" media="screen"/>
	<title>Error</title>
</head>
<body>
<div class="container">

	<h3>List of news:</h3>

	<table class="table">
		<tr>
			<th>Id</th>
			<th>Title</th>
			<th>Content</th>
		</tr>
		<c:forEach items="${recordsList}" var="record">
			<tr>
				<td>${record.id}</td>
				<td>${record.title}</td>
				<td>${record.content}</td>
			</tr>
		</c:forEach>
	</table>

	<br/>
	<br/>
	<br/>

	<h3>Add new record</h3>
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
<script src="../../resources/js/jquery-1.12.3.min.js"></script>