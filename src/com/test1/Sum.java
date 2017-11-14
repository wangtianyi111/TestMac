package com.test1;

import java.math.BigInteger;
import java.util.Scanner;

//好气，https://www.nowcoder.com/practice/c66df29f6c1c4dbba0bd51619210e082?tpId=64&&tqId=29614&rp=7&ru=/activity/oj&qru=/ta/hit-kaoyan/question-ranking通不过！！！
public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int n = scanner.nextInt();
		BigInteger sum = BigInteger.valueOf(0);
		BigInteger p = BigInteger.valueOf(0);
		for (int i = n,j = 0; i >0 ; i--,j++) {
			p = rewritePow(10, j).multiply(BigInteger.valueOf(i*a)) ;
			//System.out.println("p = " + p);
			sum = sum.add(p);
		}
		System.out.println("sum = " + sum);
	}
	
	public static BigInteger rewritePow(int x,int y){
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 0; i < y; i++) {
			result = result.multiply(BigInteger.valueOf(x));
		}
		return result;
	}

}
