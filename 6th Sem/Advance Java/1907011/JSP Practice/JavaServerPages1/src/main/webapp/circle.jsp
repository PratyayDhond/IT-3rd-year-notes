<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Circle</title>
</head>
<body>
	<%! int radius = 0;
		final float PI = 3.14f;
		
		float getArea(int radius){
			return this.PI * radius * radius;
		}
		
		float getPerimeter(int radius){
			return this.PI * radius * 2;
		}
		
		float getDiameter(int radius){
			return radius * 2;
		}
	%>
	
	<%
		try{
			radius = Integer.parseInt(request.getParameter("radius"));
		}catch(Exception e){
			System.out.println(e);
		}
	%>
	
		Radius   : <% out.println(radius); %>		<br>
		Diameter : <% out.println(getDiameter(radius));%> <br>		
		Area     : <% out.println(getArea(radius));%><br>
		Perimeter: <% out.println(getPerimeter(radius)); %> 
</body>
</html>