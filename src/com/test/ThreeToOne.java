package com.test;

public class ThreeToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a=new int[500];
		for (int i = 0; i < a.length; i++) {
			a[i]=1;
		}
		int i=500,k=0;
		for (int j = 0; i>1; j=(j+1)%500) {
				if(a[j]!=0)
					k++;
				if(k==3)
					{a[j]=0;k=0;i--;}
		}
		for (int j = 0; j < a.length; j++) {
			if(a[j]!=0)
				System.out.println(j);
		}
	
	}

}
