package com.test;
import java.io.*;
public class TestDataStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(baos);
		try {
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
			DataInputStream dis=new DataInputStream(bais);
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
