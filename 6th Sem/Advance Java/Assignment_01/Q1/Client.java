import java.io.*;
import java.net.*;

public class Client{

    public static void main(String[] args) throws Exception{
	    Socket s = new Socket("LocalHost",6666);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("Connection Has Been Established Successfully");
        System.out.println("Connected Successfully");
    }
 }
