<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task</title>
<style type="text/css">
td {
	padding: 10px;
}
</style>
</head>
<body>
<h1>To do list</h1>
<p>Add new task</p>
<hr>
<table>
<form:form modelAttribute="task" action="save-task">
	<form:hidden path="id"/>	
	<tr><td>Priority</td><td><form:input path="priority"/></td></tr>
	<tr><td>Notice</td><td><form:input path="notice"/></td></tr>
	<tr><td>Finished</td><td><form:checkbox path="finished"/></td></tr>
	<tr><td colspan="2"><input type="submit" value="Save"></td></tr>
</form:form>
</table>

</body>
</html>