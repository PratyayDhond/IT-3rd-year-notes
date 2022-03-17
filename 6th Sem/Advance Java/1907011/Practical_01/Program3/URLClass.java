import java.net.*;
import java.io.*;

class URLClass{
  public static void main(String[] args) throws Exception{
  	URL url = new URL("http://pratyayDhond.me/Self-Assess");
	String protocol = url.getProtocol();
	String hostName = url.getHost();
	int port = url.getPort(); // If port is left as it is -1 by default
	String fileName = url.getFile();
	
	System.out.println("Protocol : " + protocol);
	System.out.println("Host Name : " + hostName);
	System.out.println("Port : " + port);
	System.out.println("File Name: " + fileName);
    }  
  }
