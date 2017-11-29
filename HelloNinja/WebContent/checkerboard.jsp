<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Checkerboard</title>
<link rel="stylesheet" type="text/css" href="checkerboard.css">
</head>
<body>
	<h1>Enter the width and height of the desired checkerboard in the url.</h1>
	
	<% int width = Integer.parseInt(request.getParameter("width")); %>
	<% int height = Integer.parseInt(request.getParameter("height")); %>
	<% boolean red = true; %>
	
	<h2>Width:  <%= width %></h2>
	<h2>Height: <%= height %></h2>
	
	<% for(int row = 1; row <= height; row++) { %>
	<%    red = row % 2 != 0; %>
 	<%    for (int col = 1; col <= width; col++) { %>
 	<%	     if (red) { %>
 		    	<span class="odd"></span>
    <%          red = false; %>
 	<%		 } else { %>
 				<span class="even"></span>
 	<%          red = true; %>			
 	<%       } %>
 	<%	  } %>
 		  <br>
    <% } %>
	
</body>
</html>