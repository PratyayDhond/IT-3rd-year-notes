import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Q5_Client {

    public static void main(String[] args) throws Exception{
      DatagramSocket ds = new DatagramSocket();
      String str = null;
      Scanner sc = new Scanner(System.in);
      byte[] b = null;
      InetAddress inet = InetAddress.getLocalHost();
      str = sc.nextLine();
      b = str.getBytes();
      DatagramPacket dp = new DatagramPacket(b,b.length,inet,2003);
      ds.send(dp);
    }
}


