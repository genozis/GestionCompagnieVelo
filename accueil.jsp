<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String nom = new String((String)session.getAttribute("nom"));
	String prenom = new String((String)session.getAttribute("prenom"));%>
	<%= prenom +"  "+nom %>
	
	<br><br>
	------------------------------------------------------------------------------------------------
	<br><br><br>
	
	<form method="post" action="JSP/reservation.html">
	<input type="submit" value="Réserver un Vélo">
	
	<br><br><br>
	------------------------------------------------------------------------------------------------
	<br><br><br>
	Mes réservations
	
	</form>
</body>
</html>