package com.test1;

import java.util.Scanner;

public class BaiduTest2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = scanner.nextInt();
			}
			
			//find the node(which is far from the last node)
			int d = 0;
			if (n > 2) {
				int max = 0;
				int k = 0;
				
				for (int i = 1; i < a.length-1; i++) {
					if(Math.abs(a[i] - a[a.length-1]) > max){
						max = Math.abs(a[i] - a[a.length-1]);
						k = i;
					}
				}
				System.out.println("k=" + k);
				for (int i = k; i < a.length - 1; i++) {
					a[i] = a[i+1];
				}
				for (int i = 0; i < a.length-2; i++) {
					d += Math.abs(a[i] - a[i+1]);
				}
			}else { 
				d = Math.abs(a[0] - a[1]);
			}
			
			System.out.println(d);
		}
	}
}
