package com.test1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JdTest01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			// int[] a = new int[2*n];
			/*
			 * for (int i = 0; i < n; i++) { a[i] = scanner.nextInt(); }
			 */
			int[] b = new int[2 * n];

			for (int j = 0; j < 2 * n; j++) {
				if (j < n) {
					b[j] = scanner.nextInt();
				} else {
					b[j] = b[j - n];
				}

			}

			/*
			 * for (int i = 0; i < b.length; i++) { System.out.println("b=" +
			 * b[i]); }
			 */
			int k;
			int sMax;
			Integer num = 0;
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < n; i++) {
				sMax = 0;
				for (int j = i + 1; j < i + n - 2; j++) {
					if (b[i] < b[j]) {
						break;
					} else {
						if (b[j] > sMax) {
							sMax = b[j];
							// System.out.println("bj=" + b[j]);
						}
						if (b[j + 1] >= sMax) {
							if (j + 1 < n) {
								k = j + 1;
								if (k < i) {
									num = k * 10 + i;
									set.add(num);
								} else {
									num = i * 10 + k;
									set.add(num);
								}
							} else {
								k = j + 1 - n;
								if (k < i) {
									num = k * 10 + i;
									set.add(num);
								} else {
									num = i * 10 + k;
									set.add(num);
								}
							}
						}
					}
				}
			}
			System.out.println(set.size() + n);

		}
	}
}
