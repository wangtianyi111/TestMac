package com.test1;

import java.util.Scanner;

public class Transation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			int a = Integer.parseInt(scanner.next());
			if (a < 0) {
				a = a * -1;
			}
			int b,count = 0;
			while(a > 9){
				b = 1;
				while(a != 0){
					b = b * (a % 10);
					a = a / 10;
				}
				a = b;
				count ++;
			}
			System.out.println(count);
		}
	}
}
