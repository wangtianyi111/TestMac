package com.test1;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaiduTest4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String sn = scanner.nextLine();
			int n = Integer.parseInt(sn);
			int[] a = new int[n];
			String string = scanner.nextLine();
			String[] strings = string.split(" ");
			for (int i = 0; i < strings.length; i++) {
				a[i] = Integer.parseInt(strings[i]);
			}
			
			//int[] b = a;   a  is changed
			
			int[] b = new int[a.length];
			for (int i = 0; i < b.length; i++) {
				b[i] = a[i];
			}
			Arrays.sort(b);
			//test the value of a and b
			/*Arrays.sort(b);
			for (int i = 0; i < b.length; i++) {
				System.out.print("b:" + b[i]);
			}
			System.out.println();
			for (int i = 0; i < a.length; i++) {
				System.out.print("a:" + a[i]);
			}*/
			int op = 0;
			int count = 0;
			int k = 0;
			int j;
			boolean flag = false;
			if (a[a.length-1] == b[0]) {
				System.out.println(a.length-1);
				return;
			}
			if (Arrays.equals(a, b)) {
				System.out.println(0);
				return;
			}
			for (int i = 0; i < b.length; i++) {
				j = k;
				for (; j < a.length-1;j++ ) {
					if(b[i] == a[j]){
						count++;
						k = j+1;
						break;
					}else {
						if (a[a.length-1] > a[j]) {
							flag = true;
							System.out.println("j=" + j);
							System.out.println("a[j]" + a[j] + ";a[last]=" + a[a.length-1]+ ";b[i]" + b[i]);
						}
					}
				}
			}
			op = n-1-count;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i] < a[a.length-1] && flag==true) {
					op++;
					System.out.println("hahaha");
					break;
				}
			}
			
			System.out.println(op);
			
		}
	}

}
