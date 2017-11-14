package com.test;

class Father{
	public int value;
	public void f(){
		value=100;
		System.out.println("Father.value£»"+value);
		
	}
}

class Son extends Father{
	private int value;
	@Override
	public void f() {
		// TODO Auto-generated method stub
		super.f();
		value=200;
		System.out.println(value);
		System.out.println(super.value);
	}
} 

public class TestInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son son=new Son();
		son.f();
	}

}
