import java.io.*;
import java.net.*;

public class URLConnectionClass {

    public static void main(String[] args) throws Exception{
       URL url = new URL("http://pratyaydhond.me/Self-Assess/about-us.html");
       URLConnection urlConnection = url.openConnection();
       InputStream in = urlConnection.getInputStream();
       int i;
       while((i=in.read())!=-1){
           System.out.print((char)i);
       }
       System.out.println();
       System.out.println("Host: " + url.getHost());
       System.out.println("Protocol: " + url.getProtocol());
       System.out.println("File: " + url.getFile());
    }
}


