package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream in=null;
		try {
			in=new FileInputStream("myfile.txt");
			int b;
			b=in.read();
			while(b!=-1){
				System.out.println((char)b);
				b=in.read();
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally {
			try {
				in.close();
				
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
