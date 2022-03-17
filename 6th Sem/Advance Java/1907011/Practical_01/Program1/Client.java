import java.io.*;
import java.net.*;

public class Client{

    public static void main(String[] args) throws Exception{
	    Socket s = new Socket("LocalHost",1212);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        System.out.println("Connected Successfully");
        dos.writeUTF("Connection Has Been Established Successfully");
        s.close();
    }
}
