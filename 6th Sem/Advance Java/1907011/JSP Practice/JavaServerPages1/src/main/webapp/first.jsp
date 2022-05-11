<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String name = "Pratyay";
    int age = 19;%>

<%
	try{
		if(!request.getParameter("name").toString().isEmpty())
			name = request.getParameter("name");		
	}catch(Exception e){
		System.out.println(e);
	}

	try{
		if(!request.getParameter("age").toString().isEmpty())
			age = Integer.parseInt(request.getParameter("age"));	
	}catch(Exception e){
		System.out.println(e);
	}
	
%>

<p> Name : <%out.println(name); %></p>
<p> Age  : <%out.println(age); %></p>

</body>
</html>