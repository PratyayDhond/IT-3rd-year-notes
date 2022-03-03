import java.io.*;
import java.net.*;

public class Q2_Client {

    public static void main(String[] args) throws Exception{
      Socket s = new Socket("Localhost",1234);

        //To send to server
      DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        //To read data coming from the server
      InputStreamReader isr = new InputStreamReader(s.getInputStream());
      BufferedReader br = new BufferedReader(isr);

        //To read data from keyboard
      BufferedReader readFromKeyboard = new BufferedReader(new InputStreamReader(System.in));

      String s1,s2;
      System.out.print(">");
      s1 = readFromKeyboard.readLine();
      dos.writeBytes(s1 + "\n");
      s2 = br.readLine();

      System.out.println("Server: " + s2);

      dos.close();
      br.close();
      readFromKeyboard.close();
      s.close();

    }
}


