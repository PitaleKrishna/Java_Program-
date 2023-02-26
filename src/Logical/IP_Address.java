package Logical;

import java.net.InetAddress;

public class IP_Address {
	
	   public static void main(String args[]) throws Exception
	    { 
		   InetAddress IP=InetAddress.getLocalHost();
		   
		   System.out.println("IP Address In My System : "+IP.getHostAddress());
	    }  
}
