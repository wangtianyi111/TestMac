package com.test;

import java.math.BigInteger;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		//System.out.println(zuhe(45,90));
		//System.out.println(jc(90));
	    Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			BigInteger count = new BigInteger("0");
			int x;
			for (int y = 0; y <= n / 2; y++) {
				x = n - 2 * y;
				if (y == 0 || x == 0) {
					count = count.add(BigInteger.valueOf(1));
				} else {
					count = count.add(zuhe(y, x + y));
				}
			}
			System.out.println(count);
		}
		scanner.close();
	}

	public static BigInteger jc(int n) {
		BigInteger sum = new BigInteger("0");
		if (n == 1) {
			sum = BigInteger.valueOf(1);
		} else {
			sum = BigInteger.valueOf(n).multiply(jc(n - 1));
		}
		return sum;
	}

	public static BigInteger zuhe(int n, int m) {
		return (jc(m).divide(jc(n).multiply(jc(m-n))));
	}

}
