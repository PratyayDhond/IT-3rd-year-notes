import java.io.*;
import java.net.*;

public class Q4 {

    public static void main(String[] args) throws Exception{
       InetAddress inet = InetAddress.getByName("www.javatpoint.com");
       System.out.println("Host Name: " + inet.getHostName());
       System.out.println("IP: " + inet.getHostAddress());
    }
}


