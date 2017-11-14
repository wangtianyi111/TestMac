package com.test;

import java.util.Scanner;

public class Huiwen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String string = scanner.nextLine();
			int i,j;
			for(i = 0, j = string.length()-1;string.charAt(i) == string.charAt(j) && i <= j;i++,j--){
				
			}
			if(i >= string.length()/2){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			
		}
	}

}
