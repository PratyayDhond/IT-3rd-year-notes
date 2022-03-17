
import java.io.*;
import java.net.*;

class Client{

  public static void main(String[] args) throws Exception{
    System.out.println("--------------------Client Program-------------------- \n");
    Socket s = new Socket("LocalHost",2003);
    DataInputStream din = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = "",str2 = "";

    while(!str1.equals("-1") && !str2.equals("-1")){
      System.out.print("> ");
      str1 = br.readLine();
      dos.writeUTF(str1);
      str2 = din.readUTF();
      if(!str2.equals("-1"))
        System.out.println("Server: " + str2);
      else{
      	dos.writeUTF("-1");  
      	break;
      }  
    }
    din.close();
    dos.close();
    s.close();
    System.out.println("Connection closed");

  }


}
