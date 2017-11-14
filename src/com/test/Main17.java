package com.test;

import java.util.Scanner;

public class Main17 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String s = "";
		while(scanner.hasNext()){
			s = scanner.nextLine();
			String[] strings = s.trim().split(" ");
			for (int i = 0; i < strings.length; i++) {
				if (i ==  (strings.length-1)) {
					System.out.println(strings[i].length() - 1);
				}
				else{
					System.out.print(strings[i].length() + " " );
				}
					
				
			}
			
		}
	}
}
