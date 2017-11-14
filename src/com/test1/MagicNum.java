package com.test1;

import java.util.Scanner;

public class MagicNum {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int count = 0;
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			for (int i = a; i <= b; i++) {
				int flag = 0;
				int n = countOfInt(i);
				int[] arr = IntoArr(i);
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n ; k++) {
						if (k == j) {
							continue;
						}else {
							if ( arr[j] > 0 ) {
								int num = arr[j]*10 + arr[k];
								
								if (judegNum(num) == true && num > 10) {
									count ++;
									flag = 1;
									break;
								}
							}
						}
						
					}
					if (flag == 1) {
						break;
					}
				}
			}
			System.out.println(count);
		}
	}
	
	public static boolean judegNum(int a){
		 if (a < 1) {
			return false;
		}else {
			int b = (int)Math.sqrt(a);
			for (int i = 2; i <= b; i++) {
				if (a % i == 0) {
					return false;
				}
			}
			return true;// is zishu
		}
	}
	
	public static int countOfInt(int a){
		if (a < 0) {
			a = a*-1;
		}
		int count = 0;
		if (a == 0) {
			count = 1;
		}
		while(a != 0){
			a = a/10;
			count++;
		}
		return count;
	}
	
	public static int[] IntoArr(int a){
		int n = countOfInt(a);
		int[] arr = new int[n]; 
		for (int i = 0; i < arr.length; i++) {
			n--;
			arr[n] = a % 10;
			a = a/10;
		}
		
		return arr;
	}
}
