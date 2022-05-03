import java.rmi.*;
import java.io.*;
import java.util.Scanner;
import java.util.Scanner;

public class AddClient{
    public static void main(String[] args) throws Exception{

      String ip = "127.0.0.1";      

      String url = "rmi://" + ip + "/AddServer";
      AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(url);
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter an interger: ");
      long number = sc.nextInt();
      System.out.print("Enter the power: ");
      long power = sc.nextInt();  
      
	long answer = addServerIntf.powerOf(number,power);
    System.out.println(number + " raised to the power " + power + " is " + answer);
    }
}
