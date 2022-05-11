<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cube Calculator</title>
</head>
<body>
 <%! int number = 0;
 	 int cube = 0;
 	 
 	 public int getCube(int number){
 		 return number * number * number;
 	 }
 %>
 
 <% 
 	try{
 		number = Integer.parseInt(request.getParameter("number"));
 		System.out.println(number);
 	}catch(Exception e){
 		
 	}
 %>
 
 number : <b> <% out.println(number); %> </b> <br>
 cube   : <b> <% out.println(getCube(number)); %></b>
 
 <br><br>
 <a href="cube.html"> Find another number's cube.</a>
</body>
</html>