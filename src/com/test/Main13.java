package com.test;

import java.util.ArrayList;

public class Main13 {  
  
    public static ArrayList<String> permutation(char[] buf, ArrayList<String> h,int start, int end) {  
    	if (start == end) {// ��ֻҪ���������һ����ĸ����ȫ����ʱ��ֻҪ�Ͱ��������������  
            int i = 0;
            for (i = 0; i < h.size(); i++) {
				if (h.get(i).equals(String.valueOf(buf)) == true) {
					break;
				}
			}
            if (i == h.size()) {
            	 h.add(String.valueOf(buf));
			}
        } else {// �����ĸȫ����  
            for (int i = start; i <= end; i++) {
                char temp = buf[start];// ���������һ��Ԫ���������Ԫ��  
                buf[start] = buf[i];  
                buf[i] = temp;  
  
                permutation(buf,h,start + 1, end);// ����Ԫ�صݹ�ȫ����  
  
                temp = buf[start];// ������������黹ԭ  
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