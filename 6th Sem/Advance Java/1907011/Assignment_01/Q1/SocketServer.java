import java.io.*;
import java.net.*;

public class SocketServer{

    public static void main(String[] args) throws Exception{
	    ServerSocket serverSocket = new ServerSocket(6666);
        Socket s = serverSocket.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = (String) dis.readUTF();
        System.out.println("Client: " + str);
        //System.out.println("Connected Successfully");
    }
}

