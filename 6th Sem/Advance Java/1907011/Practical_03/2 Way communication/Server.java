import java.io.*;
import java.net.*;

class Server{
  public static void main(String[] args) throws Exception{
    System.out.println("--------------------Server Program-------------------- \n");
    ServerSocket ss = new ServerSocket(2003);
    Socket s = ss.accept();

    DataInputStream din = new DataInputStream(s.getInputStream());
    DataOutputStream dos =new DataOutputStream(s.getOutputStream());

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1="",str2="";

    while(!str1.equals("-1") && !str2.equals("-1")){
      str1 = din.readUTF();
      if(!str1.equals("-1"))
        System.out.println("Client: " + str1);
      else{
      	dos.writeUTF("-1");
      	break;  
      }
      System.out.print("> ");
      str2 = br.readLine();
      dos.writeUTF(str2);
    }

    dos.close();
    din.close();
    ss.close();
    s.close();
    System.out.println("Server disconnected successfully");
  }
}
