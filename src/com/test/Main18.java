package com.test;

import java.util.*;

public class Main18 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int num = scanner.nextInt();
			String[] strings = new String[num];
			for (int i = 0; i < num; i++) {
				strings[i] = reverse(tByte(scanner.nextInt()));
			}
			for (int i = 0; i < strings.length; i++) {
				System.out.println(strings[i]);
			}
		}
	}
	
	public static String tByte(int a){
		String string = "";
		while(a != 1){
			string += a % 2;
			a = a / 2;
		}
		return string + "1";
	}
	
	public static String reverse(String string){
		char[] arr = string.toCharArray();
		for (int i = 0, j = string.length() - 1; i < j; i++,j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return String.valueOf(arr);
	}
}
