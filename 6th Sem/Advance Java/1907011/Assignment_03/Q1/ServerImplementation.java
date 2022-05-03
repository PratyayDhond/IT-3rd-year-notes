import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
import java.sql.*;

class ServerImplementation extends UnicastRemoteObject implements Server{
	ServerImplementation() throws RemoteException{}

	public List<Client> getClients(){
		List<Client> list = new ArrayList<Client>();

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment3","root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMERS;");

			while (rs.next()){
				Client c = new Client();
				c.setAccNo(rs.getInt(1));
				c.setFirstName(rs.getString(2));
				c.setLastName(rs.getString(3));
				c.setEmail(rs.getString(4));
				list.add(c);
			}

			con.close();
		}catch (Exception e){
			System.out.println(e);
		}

		return list;
	}

}