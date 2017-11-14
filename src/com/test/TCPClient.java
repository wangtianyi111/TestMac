package com.test;
import java.io.*;
import java.net.*;
public class TCPClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Socket s=new Socket("127.0.0.1", 8888);
		OutputStream os=s.getOutputStream();
		DataOutput dos=new DataOutputStream(os);
		dos.writeUTF("hello server!");
		os.flush();
		os.close();
		s.close();
	}

}
