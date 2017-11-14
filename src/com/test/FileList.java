package com.test;
import java.io.*;

public class FileList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f=new File("d:/A");
		System.out.println(f.getName());
		tree(f,1);
		A a = new A();
	}
	
	private static void tree(File f,int n){
		String s="";
		for (int i = 0; i < n; i++) {
			s+="   ";
			
		}
		File[] child=f.listFiles();
		for (int i = 0; i < child.length; i++) {
			System.out.println(s+child[i].getName());
			if(child[i].isDirectory()){
			tree(child[i],n+1);
			}
		}
		
	}

}
