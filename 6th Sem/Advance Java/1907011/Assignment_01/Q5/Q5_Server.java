import java.io.*;
import java.net.*;

public class Q5_Server {

    public static void main(String[] args) throws Exception{
       DatagramSocket ds = new DatagramSocket(2003);
       byte[] b = new byte[1024];
       DatagramPacket dp = new DatagramPacket(b,b.length);
       ds.receive(dp);
       String str = new String(dp.getData());
        System.out.println("Connection Established.");
        System.out.println("Client: " + str.trim());
    }
}


