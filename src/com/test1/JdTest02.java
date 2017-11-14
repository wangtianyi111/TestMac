package com.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JdTest02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			if (n < 3) {
				return;
			}
			int sum = 0;
			int count = 0;
			for (int i = 2; i <= n - 1; i++) {
				// int a = convert(n,i);
				sum += add(n, i);
				count++;
			}
			int gy = gongyueshu(sum, count);
			System.out.println("gy=" + gy);
			if (gy != 0) {
				sum = sum / gy;
				count = count / gy;
			}
			System.out.println(sum + "/" + count);
		}
	}

	private static int gongyueshu(int num1, int num2) {
		while (true) {
			if ((num1 = num1 % num2) == 0) {
				return num2;
			}
			if ((num2 = num2 % num1) == 0) {
				return num1;
			}
		}
		
	}

	private static int add(int n, int i) {
		int sum = 0;
		int a = 0;
		while (n != 0) {
			a = n % i;
			n = n / i;
			sum += a;
		}
		//System.out.println(sum);
		return sum;

	}

}
