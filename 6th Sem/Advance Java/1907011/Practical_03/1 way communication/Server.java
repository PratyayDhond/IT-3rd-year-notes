import java.net.*;
import java.io.*;

class Server {

  final static String END_CONNECTION = "END_CONNECTION";

  public static void main(String[] args) throws Exception{
    ServerSocket serverSocket = new ServerSocket(1234);
    Socket s = serverSocket.accept();
    System.out.println("Connection Established\n");
    DataInputStream din = new DataInputStream(s.getInputStream());

    while(true){
      String str = din.readUTF();

      if(str.contains(END_CONNECTION))
        break;
      else
         System.out.println(str);
    }

    System.out.println("\n" + "Connection Closed Successfully");
  }
}
