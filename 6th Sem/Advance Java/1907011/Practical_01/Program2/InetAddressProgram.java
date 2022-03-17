// Write a program to print domain name (aka host name), and their IP address using Inetaddress class.

import java.net.*;
import java.io.*;

class InetAddressProgram{
   public static void main(String[] args) throws Exception{
     InetAddress inet = InetAddress.getByName("www.pratyayDhond.me");
     System.out.println("Domain Name : " + inet.getHostName());
     System.out.println("IP Address  : " + inet.getHostAddress());
   }
}
