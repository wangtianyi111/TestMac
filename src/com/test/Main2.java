package com.test;

import java.util.Scanner;

public class Main2 {

	public static void main (String[] args){
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        String[] ss = str.split(" ");
	        int num1 = Integer.parseInt(ss[0]);
	        int num2 = Integer.parseInt(ss[1]);
	        System.out.println(num1 + num2);
	    }

}
