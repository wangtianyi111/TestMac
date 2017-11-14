package com.test;

import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner scanner = new Scanner(System.in);
		int y,m,num;
		while(scanner.hasNext()){
			y = scanner.nextInt();
			num = scanner.nextInt();
			if (isLeap(y) == true) {
				month[1] = 29;
			}
			else {
				month[1] = 28;
			}
			m = 1;
			for (int i = 0; i < month.length; i++) {
				if (num > month[i]) {
					num = num - month[i];
					m++;
				}
				else{
					break;
				}
			}
			if (m > 9) {
				if (num > 9) {
					System.out.println(y + "-" + m + "-" + num);
				}
				else {
					System.out.println(y + "-" + m + "-0" + num);
				}
			}
			else {
				if (num > 9) {
					System.out.println(y + "-0" + m + "-" + num);
				}
				else {
					System.out.println(y + "-0" + m + "-0" + num);
				}
			}
		}
	}
	
	public static boolean isLeap(int year){
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}
	
}
