import java.util.*;  
import java.rmi.*; 

class MyClient{
	public static void main(String[] args) throws Exception{
		Server s = (Server) Naming.lookup("rmi://127.0.0.1/AddServer");

		List<Client> list = s.getClients();
		for(Client c : list){
			System.out.println(c.getAccNo() + " " + c.getFirstName() + " " + c.getLastName() + " " + c.getEmail());
		}
	}
}
