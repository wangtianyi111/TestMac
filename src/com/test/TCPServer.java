package com.test;

import java.net.*;
import java.io.*;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ServerSocket ss=new ServerSocket(8888);
		//while(true){
	       Socket s=ss.accept();
	       //System.out.println("a client connects!");
	       DataInputStream dis=new DataInputStream(s.getInputStream());
	       System.out.println(dis.readUTF());
	       dis.close();
	       s.close();
		//}
	}
	

}
