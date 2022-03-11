import java.io.*;
import java.net.*;

public class Q2_Server {

    public static void main(String[] args) throws Exception{
      ServerSocket serverSocket = new ServerSocket(1234);
      Socket s = serverSocket.accept();
      System.out.println("Connection Successful");

      //Sending data to client
      PrintStream ps = new PrintStream(s.getOutputStream());

      //Receiving Data from client.
      InputStreamReader isr = new InputStreamReader(s.getInputStream());
      BufferedReader br = new BufferedReader(isr);

      InputStreamReader isr2 = new InputStreamReader(System.in);
      BufferedReader br2 = new BufferedReader(isr2);

      String str1,str2;
      
 //     while((str1 = br.readLine()) != null){
          str1 = br.readLine();
          System.out.println("Client: " + str1);
          System.out.print(">");	
          str2 = br2.readLine();
          ps.println(str2);
//      }

      ps.close();
      br.close();
      br2.close();
      serverSocket.close();
      s.close();

    }
}


