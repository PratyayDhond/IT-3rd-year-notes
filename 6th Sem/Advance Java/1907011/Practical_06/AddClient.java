import java.rmi.*;
import java.io.*;
import java.util.Scanner;

public class AddClient{
    public static void main(String[] args) throws Exception{

      String ip;
      double a,b;
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter IP Address Client[-1 if no remote client]: ");
      ip = sc.nextLine();
      if(ip.equals("-1")){
        ip = "127.0.0.1";
      }

      String url = "rmi://" + ip + "/AddServer";
      AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(url);

      System.out.println("Enter the first number: ");
      a = sc.nextDouble();
      System.out.println("Enter the second number: ");
      b = sc.nextDouble();

      System.out.println("Addition       : " + addServerIntf.add(a,b));
      System.out.println("Subtraction    : " + addServerIntf.subtract(a,b));
      System.out.println("Multiplication : " + addServerIntf.multiply(a,b));
      System.out.println("Division       : " + addServerIntf.divide(a,b));

    }
}
