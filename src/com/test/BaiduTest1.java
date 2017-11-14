package com.test;

import java.util.Scanner;

public class BaiduTest1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scanner.nextInt();
			}

			// sort
			for (int j = 0; j < arr.length - 1; j++) {
				for (int j2 = 0; j2 < arr.length - 1 - j; j2++) {
					if (arr[j2] > arr[j2 + 1]) {
						int tmp = arr[j2];
						arr[j2] = arr[j2 + 1];
						arr[j2 + 1] = tmp;
					}
				}
			}
			int k = 1;
			int s = arr[0];
			int j = 0;
			for (j = 0; j < arr.length; j++) {
				if (arr[j] != s) {
					k++;
					s = arr[j];
				}
				if (k == 3) {
					System.out.println(arr[j]);
					return;
				}
			}
			//System.out.println("k=" + k);
			if (k < 3 && j == arr.length) {
				System.out.println("-1");
			}
			
		}
	}
}
