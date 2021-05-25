<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tasks</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
<style type="text/css">
.all-tasks {
	display: flex;
	flex-wrap: wrap;
}

.task {
	width: 200px;
	height: auto;
	padding: 10px;
	margin: 5px;
	background-color: #f2ec99;
}
</style>
</head>
<body>
<h1>To do list</h1>
<a href="task-form">Add task</a>
<hr>

<div class="all-tasks">

<c:forEach items="${tasks}" var="task">
	<div class="task">
		<p style="font-size: 18px;">${task.priority}</p>
		<p>${task.notice}</p>
		<c:if test="${task.finished == true}">
			<p style="color: green">FINISHED</p>
		</c:if>
		<c:if test="${task.finished == false}">
			<p style="color: red">NOT FINISHED</p>
			<p><a href="complete-task?id=${task.id}">FINISH</a></p>
		</c:if>
		<p><a href="update-task?id=${task.id}"><i class="fas fa-edit" style="color: green; font-size: 30px"></i></a></p>
		<p><a href="delete-task?id=${task.id}"><i class="fas fa-trash-alt" style="color: red; font-size: 30px"></i></a></p>
	</div>
</c:forEach>

</div> 

</body>
</html>