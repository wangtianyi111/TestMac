package com.test;

import java.io.*;
import java.net.*;

import org.omg.CosNaming.BindingIterator;

public class TestUDPClient {

	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub
		
		long a=10000L;
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        DataOutputStream dos=new DataOutputStream(baos);
        
        try {
			dos.writeLong(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        byte[] buf=baos.toByteArray();
        
        DatagramPacket dp=new DatagramPacket(buf, buf.length,new InetSocketAddress("127.0.0.1", 5678));
        System.out.println(buf.length);
        
        try {
			DatagramSocket ds=new DatagramSocket(8888);
			ds.send(dp);
			System.out.println("·¢ËÍ³É¹¦£¡");
			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
