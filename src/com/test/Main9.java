package com.test;

public class Main9 {

	public static void main(String[] args) {
		Main9 m = new Main9();
		System.out.println(m.NumberOf1(-1));
		//m.NumberOf1(-1);
	}
	
	public int NumberOf1(int n) {
		int count = 0;
		//if(n >= 0){               toBinaryString()同样适用于负数，不需要另外判断为负的情况！！！！！！！！！！！！
            String string = Integer.toBinaryString(n);
            char[] a = new char[string.length()];
            a = string.toCharArray();
            for (int i = 0; i < a.length; i++) {
				if (a[i] == '1') {
					count++;
				}
			}
        //}
		/*else {                
			n = 0 - n;
			String string = Integer.toBinaryString(n);
			char[] a = new char[string.length()];
			a = string.toCharArray();
			for (int i = 0; i < a.length; i++) {
				if (a[i] == '1') {
					a[i] = '0';
				}
				else {
					a[i] = '1';
				}
			}
			for(int j = a.length - 1; j >= 0; j--){
				if (a[j] == '1') {
					a[j] = '0';
				}
				else {
					a[j] = '1';
				}
			}
			for (int i = 0; i < a.length; i++) {
				if (a[i] == '1') {
					count++;
				}
			}
			count = count + (32 - a.length);
		}*/
		return count;
    }
	
	
	
	/*public int  NumberOf1(int n) {
        return Integer.bitCount(n);
    }*/

}
