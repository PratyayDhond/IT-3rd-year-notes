import java.net.*;
import java.io.*;

public class SocketServer{
   public static void main(String[] args) throws Exception{
     ServerSocket serverSocket = new ServerSocket(1212); //1212 is the port number
     Socket s = serverSocket.accept(); //Accepting connection with the server socket
     DataInputStream ins = new DataInputStream(s.getInputStream()); 
     String str = (String) ins.readUTF();
     System.out.println(str);
   }
}
