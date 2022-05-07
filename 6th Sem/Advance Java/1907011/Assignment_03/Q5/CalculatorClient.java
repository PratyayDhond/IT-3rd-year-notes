 import java.rmi.*;
import java.io.*;
import java.util.Scanner;

public class CalculatorClient{
    public static void main(String[] args) throws Exception{

      String ip = "127.0.0.1";
      double a,b;
      Scanner sc = new Scanner(System.in);
      String url = "rmi://" + ip + "/AddServer";
      Calculator calculator = (Calculator) Naming.lookup(url);

      System.out.println("Enter the first number: ");
      a = sc.nextDouble();
      System.out.println("Enter the second number: ");
      b = sc.nextDouble();

      System.out.println("Addition       : " + calculator.add(a,b));
      System.out.println("Subtraction    : " + calculator.subtract(a,b));
      System.out.println("Multiplication : " + calculator.multiply(a,b));
      System.out.println("Division       : " + calculator.divide(a,b));

    }
}
