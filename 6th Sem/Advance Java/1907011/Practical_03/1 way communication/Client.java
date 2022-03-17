import java.net.*;
import java.io.*;

class Client {
  public static void main(String[] args) throws Exception{
    Socket s = new Socket("Localhost",1234);

    DataOutputStream dout = new DataOutputStream(s.getOutputStream());

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
    String str;
    while(true){
      str = br.readLine();

      if(str.equals("-1"))
        break;
      else
        dout.writeUTF(str);
    }
    dout.writeUTF("END_CONNECTION");

    dout.close();
    s.close();
    br.close();
    isr.close();
    System.out.print("\nConnection Closed Succesfully");
  }
}
