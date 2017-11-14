package com.test;

public class lianxi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[20];
		a[0]=1;
		a[1]=1;
		int i;
		for(i=2;i<20;i++){
			a[i]=a[i-1]+a[i-2];
			
		}
		for(i=0;i<20;i++){
			System.out.println(a[i]);
		}
		

	}

}
