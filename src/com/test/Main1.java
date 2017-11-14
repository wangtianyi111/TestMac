package com.test;

import java.util.Scanner;

import javax.swing.JCheckBox;

public class Main1 {

	public static void main(String[] args) {
		//System.out.println(ojc(4));
		Scanner sc = new Scanner(System.in);
		int y1,y2;
		while(sc.hasNext()){
			int a = sc.nextInt();
			if(a % 2 ==0){
				y2 = ojc(a);
				y1 = jjc(a-1);
				System.out.println(y1 + " " + y2);
			}
			else{
				y1 = jjc(a);
				y2 = ojc(a-1);
				System.out.println(y1 + " " + y2);
			}
			
		}
		
		
	}
	
	public static int jjc(int n){
		int sum = 0;
		if( n == 1 ){
			sum = 1;
		}
		else{
			sum = jc(n) + jjc(n-2); 
		}
		return sum;
	}
	
	public static int ojc(int n ){
		int sum = 0;
		if (n == 2) {
			sum = 2;
		}
		else{
			sum = jc(n) + ojc(n-2);
		}
		return sum;
	}
	
	
	
	public static int jc(int n){
		int sum = 0;
		if (n == 1){
			sum = 1;
		}
		else{
			sum = n*jc(n-1);
		}
		return sum;
	}

}
