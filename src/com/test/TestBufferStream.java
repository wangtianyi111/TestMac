package com.test;

import java.io.*;
public class TestBufferStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string=null;
		try {
			BufferedReader br=new BufferedReader(new FileReader("d:/eclipse work/test/src/com/test/TestBufferStream.java"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("d:/test2.txt"));
			while((string=br.readLine())!=null){//readLine好用的方法
				bw.write(string);
				bw.newLine();//bufferedwriter  bufferedreader独有的方法
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
		System.out.println("文件复制成功！");
	}

}
