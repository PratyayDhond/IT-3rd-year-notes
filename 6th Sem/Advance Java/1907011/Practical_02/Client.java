import java.net.*;
import java.io.*;
import java.util.Vector;

public class Client{
 public static void main(String[] args) throws Exception{
    DatagramSocket ds = new DatagramSocket();


    InetAddress inet = InetAddress.getLocalHost();

    //For storing input and sending all input directly
    Vector<String> s = new Vector<String>();

    //for taking input from the user
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    //for sending data in form of packets

    int count = 0;
    do{
      String str = new String();
      str = br.readLine();
      s.add(str);
      count++;
    }while(!s.elementAt(count-1).equals("-1"));

    for(int i = 0;i < s.size()-1;i++){
      byte[] b = s.elementAt(i).getBytes();
      DatagramPacket dp = new DatagramPacket(b,b.length,inet,1234);
      ds.send(dp);
    }

    String str = "END_CONNECTION";
    byte[] b =str.getBytes();
    DatagramPacket dp = new DatagramPacket(b,b.length,inet,1234);
    ds.send(dp);

    isr.close();
    br.close();
    ds.close();
    System.out.println("Connection closed successfully");


  }
}