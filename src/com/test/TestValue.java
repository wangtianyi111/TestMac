package com.test;


public class TestValue {
	
	public static void main(String[] args) {
		String i = "not changed!";
		D a = new D(2);
		int[] c = {1,2,3};
		
		change(i);
		System.out.println(i);
		
		changeClass(a);
		System.out.println(a.value);
		
		changeArray(c);
		for (int j = 0; j < c.length; j++) {
			System.out.print(c[j] + " ");
		}
	}
	
	public static void change(String i){
		i = "changed!";
	}
	
	public static void  changeClass(D a){
		a.value = 1;
	}
	
	public static void changeArray(int[] a){
		for (int i = 0; i < a.length; i++) {
			a[i] = 0; 
		}
	}
}

class D{
	int value;
	public D(int value){
		this.value = value;
	}
}
