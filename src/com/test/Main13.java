package com.test;

import java.util.ArrayList;

public class Main13 {  
  
    public static ArrayList<String> permutation(char[] buf, ArrayList<String> h,int start, int end) {  
    	if (start == end) {// 当只要求对数组中一个字母进行全排列时，只要就按该数组输出即可  
            int i = 0;
            for (i = 0; i < h.size(); i++) {
				if (h.get(i).equals(String.valueOf(buf)) == true) {
					break;
				}
			}
            if (i == h.size()) {
            	 h.add(String.valueOf(buf));
			}
        } else {// 多个字母全排列  
            for (int i = start; i <= end; i++) {
                char temp = buf[start];// 交换数组第一个元素与后续的元素  
                buf[start] = buf[i];  
                buf[i] = temp;  
  
                permutation(buf,h,start + 1, end);// 后续元素递归全排列  
  
                temp = buf[start];// 将交换后的数组还原  
                buf[start] = buf[i];  
                buf[i] = temp;  
            }  
        }
    	return h;
    }  
  
    public static void main(String[] args) throws Exception {  
        char[] buf = new char[] { 'a', 'b', 'c' };  
        ArrayList<String> list = new ArrayList<>();
        permutation(buf,list, 0, 2);  
        for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
    }  
}