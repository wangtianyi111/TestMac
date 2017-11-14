package com.test;

import java.util.Scanner;

public class Main14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] a = new int[4][5];
		int[][] c = new int[4][5];
		while (scanner.hasNext()) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = scanner.nextInt();
					c[i][j] = a[i][j];
				}
			}
			int[][] a1 = new int[4][5];
			int[][] b = new int[2][5];
			for (int i = 0; i < 5; i++) {
				int k = 0;
				int max = a[0][i];
				for (int j = 0; j < 3; j++) {
					if (a[j + 1][i] > max) {
						max = a[j + 1][i];
						k = j + 1;
					}
				}
				a1[k][i] = 1;
				a[k][i] = min(a);
				
				k = 0;
				max = a[0][i];
				for (int j = 0; j < 3; j++) {
					if (a[j + 1][i] > max) {
						max = a[j + 1][i];
						k = j + 1;
					}
				}
				a1[k][i] = 1;
			}

			for (int i = 0; i < 5; i++) {
				int k = -1;
				for (int j = 0; j < 4; j++) {
					if (a1[j][i] == 1) {
						k++;
						b[k][i] = c[j][i];
					}
				}
			}

			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(b[i][j] + " ");
					if (j == 4) {
						System.out.println();
					}
				}

			}

		}
	}
	
	public static int min(int[][] a){
		int min = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
		}
		return min;
	}
	
	

}
