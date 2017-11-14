package com.test;

import java.util.Scanner;

import javax.management.Query;
import javax.swing.ScrollPaneConstants;

public class TopScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int[] a = new int[n + 1];
			a[0] = -1;
			int m = scanner.nextInt();
			for (int i = 1; i <= n; i++) {
				a[i] = scanner.nextInt();
			}
			for (int i = 0; i < m; i++) {
				String c = scanner.next();
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				switch (c) {
				case "Q":
					System.out.println(query(a, x, y));
					break;
				case "U":
					update(a, x, y);
					break;
				default:
					break;
				}
			}
		}
	}

	// ��ѯ�ɼ�
	public static int query(int[] a, int i, int j) {
		int max = a[i];
		if (i < j) {
			for (int k = i; k <= j; k++) {
				if (a[k] > max) {
					max = a[k];
				}
			}
		} else {
			for (int k = j; k <= i; k++) {
				if (a[k] > max) {
					max = a[k];
				}
			}
		}

		return max;
	}

	// ���³ɼ�
	public static void update(int[] a, int i, int num) {
		a[i] = num;
	}

}
