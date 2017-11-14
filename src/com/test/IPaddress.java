package com.test;

import java.util.Scanner;

public class IPaddress {
	/*public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			int[][] a = new int[n][4];
			for (int i = 0; i < n; i++) {
				String string = scanner.next();
				System.out.println(string);
				String[] str = new String[4];
				str = string.split("\\.");
				for (int j = 0; j < 4; j++) {
					a[i][j] = Integer.parseInt(str[j]);
				}
				judge(a[i]);
			}
		}
	}
	
	public static void  judge(int[] a){
		int i;
		for (i = 0; i < a.length; i++) {
			if(a[i] > 255 || a[i] < 0){
				System.out.println("No!");
			}
		}
		if (i >= a.length) {
			System.out.println("Yes!");
		}
		
	}*/
	public static void main(String[] args){
		System.out.println(pri(11));
	}
	
	public static String pri(int i){//只执行一个return！！
		if (i == 1) {
			return "haha";
		}
		return "xixi";
	}
	

}
