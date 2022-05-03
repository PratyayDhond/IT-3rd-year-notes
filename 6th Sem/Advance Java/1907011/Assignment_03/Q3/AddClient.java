import java.rmi.*;
import java.io.*;
import java.util.Scanner;

public class AddClient{
    public static void main(String[] args) throws Exception{

      String ip = "127.0.0.1";      

      String url = "rmi://" + ip + "/AddServer";
      AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(url);
	addServerIntf.helloThere();
    }
}
