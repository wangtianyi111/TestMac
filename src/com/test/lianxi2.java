package com.test;

public class lianxi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("��"+n+"�������ӵ�����:"+fun(n));
	}
	private static int fun(int n){
		if(n==1||n==2){
			return 1;
			
		}
		else return fun(n-1)+fun(n-2);
	}

}
