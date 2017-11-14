package com.test1;

import java.util.Scanner;

//qiu liangge zifc zhong zuiduo duoshao lianxuwei xiangdeng 
public class StrComp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			char[] s1 = scanner.next().toCharArray();
			char[] s2 = scanner.next().toCharArray();
			//System.out.println(s1[2]);
			//System.out.println(s2[4]);
			int count = 0,max = 0, k = 0;
			//int j,k =0,q = 0;
			for (int i = 0; i < s1.length;i++) {
				k = i;
				count = 0;
 				for (int j = 0; j < s2.length && k < s1.length; j++) {
 					if ( s1[k] == s2[j]) {
 						/*System.out.println("k=" + k);
						System.out.println("j=" + j);*/
						count++;
						if (count == s1.length) {
							System.out.println(0);
							return;
						}
						k++;
						if (count > max) {
							max = count;
						}
					}else {
	 					if (count > 0 ) {
	 						/*System.out.println("k..=" + k);
	 						System.out.println("j..=" + j);
	 						System.out.println("count..=" + count);*/
	 						k = i;
							j = j - count + 1;
							count = 0;
							/*System.out.println("buxiangdeng");
							System.out.println("buxiangdeng shi j=" + j);
							System.out.println("buxiangdeng shi k=" + k);*/
						}
					}
 					
				}
			}
			System.out.println((s2.length-max));
		
	}
}
