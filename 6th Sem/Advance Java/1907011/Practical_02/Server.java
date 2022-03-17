
import java.net.*;
import java.io.*;

class Server{

  final static String END_CONNECTION = "END_CONNECTION";
  public static void main(String[] args) throws Exception{
    DatagramSocket ds = new DatagramSocket(1234);

    do{
      byte[] b = new byte[1024];
      DatagramPacket dp = new DatagramPacket(b,b.length);
      ds.receive(dp);
      String str = new String(dp.getData()).trim();

      if(str.trim().contains(END_CONNECTION))
        break;
      else
        System.out.println(str.trim());
    }while(true);

  }
}