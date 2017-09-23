<%@ page language ="java" contentTypr="text/html"; pageEncoding="ISO-8859-1"% import="com.mit.*%">
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" />
	<title></ttle>
</head>
<body>
	<jsp:useBean id="obj" class="com.mit.OwnerBean"/>
	<jsp:setProperty="*" insertPhone(obj)/>		
	
	<jsp:useBean id="obj" class="com.mit.PhoneBean"/>
	<jsp:setProperty="*" insertOwner(obj)/>
	
	<%
	int status=OwnerDAO.insertOwner(obj);
	if status>0 
		out.println("Inserted Owner successfully ...");
	else
		out.println("Insertion Owner fail ...");
	
	int status=PhoneDAO.insertOwner(obj);
	if status>0 
		out.println("Inserted Phone successfully ...");
	else
		out.println("Insertion Phone fail ...");
	
	%>
</body>