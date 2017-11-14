package com.test1;

import java.util.Scanner;

public class BaiduTest2_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = scanner.nextInt();
			}

			int min = Integer.MAX_VALUE;
			if (n == 2) {
				min = Math.abs(a[0] - a[1]);
			} else {
				for (int i = 1; i < a.length - 1; i++) {
					if (distant(a, i) < min) {
						min = distant(a, i);
					}
				}
			}
			System.out.println(min);
		}

	}

	public static int distant(int a[], int k) {
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		int d = 0;
		for (int i = k; i < b.length - 1; i++) {
			b[i] = b[i + 1];
		}
		
		for (int i = 0; i < b.length - 2; i++) {
			d += Math.abs(b[i] - b[i + 1]);
		}
		return d;
	}
}
