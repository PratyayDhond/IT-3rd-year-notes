import javax.servlet.*;

import java.io.PrintWriter;
import java.sql.*;
public class PR11 extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res){
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String check = req.getParameter("check");
		boolean flag = true;
		PrintWriter out = null;
		try {
			out = res.getWriter();		
			out.println("<head>" +
					 "<style> table, th, td { border: 3rpx solid black; } </style>" +
					 "</head>");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//Printing to the console
		System.out.println("Name   : " + name);
		System.out.println("Address: " + address);
		System.out.println("City   : " + city);
		System.out.println("Check  : " + check);
		
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practicals","root","");
			stmt = con.createStatement();
			
			stmt.executeUpdate("Insert into PR11 Values ('" +name + "','" + address + "','" + city + "');");
			System.out.println("Query Executed Successfully!");
			stmt.executeUpdate("DELETE from PR11 where name = 'null' or name=' '");
			System.out.println("Deleting Successful");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		

		try {
			check.isEmpty();
			flag = true;
		}catch(Exception e) {
			flag = false;	
		}
		
		if(flag) {
			try{
				ResultSet rs = stmt.executeQuery("SELECT * From PR11");
				out.println("<h1>Database view</h1><br>");
				out.println("<table>");
				out.println("<tr>");
				out.println("<th>Name</th>");
				out.println("<th>Address</th>");
				out.println("<th>City</th>");
				out.println("</tr>");
				while(rs.next()) {
					out.println("<tr>"); 
					out.println("<td>" + rs.getString(1) +"</td>");
					out.println("<td>" + rs.getString(2) +"</td>");
					out.println("<td>" + rs.getString(3) +"</td>");
					out.println("</tr>");					
				}
				out.println("</table>");
				
			}catch(Exception e) {
				System.out.println(e);
			}

		}else {
			out.println("<h1>Your data has been written to drive successfully</h1>");
		}		
		
	}

}
