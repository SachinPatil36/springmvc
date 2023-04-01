<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About page</title>
</head>
<body>

	<h1>Learncodewith Duregsh</h1>
	<h2>Subsribe to my channel to get more videos about
		programming......</h2>
	<h1>Hfgnnffngnfnf..........</h1>
	
	
	<%
	String  name= (String)request.getAttribute("name");
	
	Integer id=(Integer)request.getAttribute("id");
	
	List<String> fnds=  (List<String>)request.getAttribute("fndsName");
	
	%>
	
	
	
	<h1>ID IS : <%= id %></h1>
	<h1>NAME IS : <%= name %></h1>
	
	
	<%
		for( String s : fnds){	

	%>
	
	<h1><%= s %></h1>
	
	<%
		}
	%>
	
	
	
	
	

</body>
</html>