package com.test;

import java.io.*;
public class TestBufferStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string=null;
		try {
			BufferedReader br=new BufferedReader(new FileReader("d:/eclipse work/test/src/com/test/TestBufferStream.java"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("d:/test2.txt"));
			while((string=br.readLine())!=null){//readLine���õķ���
				bw.write(string);
				bw.newLine();//bufferedwriter  bufferedreader���еķ���
			}
			bw.flush();
			br.close();bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ļ����Ƴɹ���");
	}

}
