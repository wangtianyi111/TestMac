package com.test;
import java.io.*;
public class TestFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reader fr=null;
		Writer fw=null;
		int b=0;
		int count=0;
		try {
			fr=new FileReader("D:/eclipse work/test/src/com/test/TestFileCopy.java");
			fw=new FileWriter("d:/test1.txt");
			while((b=fr.read())!=-1){
				fw.write(b);
				//System.out.print((char)b);
				count++;
			}
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ��Ҳ�����");System.exit(-1);
			// TODO: handle exception
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("�ļ����ƴ���");System.exit(-1);
		}
		System.out.println("�ļ����Ƴɹ���");
		System.out.println(count);
	}

}
