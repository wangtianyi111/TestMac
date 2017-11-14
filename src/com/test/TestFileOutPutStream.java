package com.test;
import java.io.*;

public class TestFileOutPutStream {

	public static void main(String Args[]) {
		int b=0,count=0;
		try {
		
			FileInputStream in=new FileInputStream("d:/eclipse work/test/src/com/test/TestFileOutPutStream.java");
		
			FileOutputStream out=new FileOutputStream("d:/test.txt");
		
			
		
			while((b=in.read())!=-1){
				out.write(b);
				count++;
			}
			in.close();
			out.close();
		}catch(FileNotFoundException e1){
			System.out.println("文件找不到！");System.exit(-1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("文件复制错误！");System.exit(-1);
		}
		System.out.println("文件复制成功！");
		System.out.println(count);
	}
}
