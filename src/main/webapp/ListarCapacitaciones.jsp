<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
   
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
	
<link rel="stylesheet" href="css/Style.css">
<%@include file = "extras/Navbar.jsp" %>
<!-- <meta charset="ISO-8859-1"> -->
<title>Lista Capacitaciones</title>
</head >
<body id="lista">
<div >

<h1>Listado de Capacitaciones</h1>

<%@ page import="java.util.ArrayList" %>

<ul class="list-group">
<%
ArrayList miArrayList = new ArrayList();
miArrayList.add("Capacitacion 1");
miArrayList.add("Capacitacion 2");
miArrayList.add("Capacitacion 3");


for (int i = 0; i < miArrayList.size(); i++) {
%>
<div >


  <li class="list-group-item" aria-current="true">
  
  <%= miArrayList.get(i) %>
  
  </li >
  </div>
<%
}
%>
</ul>

</div>

<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
	integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"
	integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD"
	crossorigin="anonymous"></script>
</body>
<footer>
<%@include file="extras/footer.jsp"%>
</footer>
</html>