package com.test;

public class TestArray1 {
	public static void main(String args[]){
		TestArray1 a1=new TestArray1();
		int[] a={2,1,4,3,6,5,7,9,8};    //æ≤Ã¨≥ı ºªØ
		a1.print(a);
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		System.out.println();
		a1.print(a);
		
	}
	public  void print (int a[]){
			for(int i=0;i<a.length;i++)
				System.out.print(a[i]+" ");
	}

}

