package com.test1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.test1.FileUtil;
public class FileRW_demo {
	public static void main(String[] args) {
		String[] string1 = FileUtil.read("C:\\Users\\wty\\Desktop\\result01.csv", null);
		String[] string11 = FileUtil.read("C:\\Users\\wty\\Desktop\\zip\\data_test.csv", null);
		
		
		String[] string2 = new String[100];
		String[] string22 = new String[100];
		String[] string222 = new String[100];
		int j = 0;
		int k = 0;
		int n = 0;
		int m = 1;
		for (int i = 2; i < 102; i++) {
			String[] string3 = string1[i].split("\\,");
			String[] string33 = string11[i].split("\\,");
			
			string2[j++] = string3[string3.length-1];
			string22[k++] = string33[string33.length-1];
			
			string222[n++] = m + "," + string3[string3.length-1];
			m ++;
		}
		System.out.println(string2[0]);
		System.out.println(string2[99]);
	
	
		/*try {
			for (int i = 0; i < 100; i++) {
				FileWriter fw = new FileWriter("C:\\Users\\wty\\Desktop\\result_tset.csv",true);   
		        PrintWriter pw=new PrintWriter(fw);   
		        pw.println(string2[i]);   //字符串末尾不需要换行符
		        pw.close () ;   
		        fw.close () ;  
			}
	         
	    } catch (IOException e) {   
	        e.printStackTrace();   
	    } */
		
		FileUtil.write("C:\\Users\\wty\\Desktop\\result_tset.csv", string222, false);
	}
}
