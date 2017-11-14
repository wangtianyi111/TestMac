package com.test;

import java.math.BigInteger;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), i = 0;
		BigInteger[] bi = new BigInteger[n];
		while (scanner.hasNextBigInteger() && i <n) {
			System.out.println(i);
			bi[i] = scanner.nextBigInteger();
			i++;
			
		}
		bi = sort(bi);
		for (int j = 0; j < bi.length ; j++) {
			System.out.println(bi[j]);
		}

	}

	public static BigInteger[] sort(BigInteger[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					BigInteger tem = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tem;
				}
			}
		}
		return a;
	}

}
