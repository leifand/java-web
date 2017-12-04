<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Random Word Generator</title>
</head>
<body>
	<h1>You have generated a word times <c:out value="${counter}"></c:out>.</h1>
	<p><c:out value="${randomWord}"></c:out></p>
	<form action="Home">
		<input type="submit" name="generate" value="Generate">
	</form>
	<p>The last time you generated a word was:</p>

	<p><c:out value="${lastGenerated}"></c:out></p>
</body>
</html>
