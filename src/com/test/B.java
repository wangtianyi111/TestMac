package com.test;

class A{
	protected void print(String s) {
		System.out.println(s);
		
	}
	
	A(){
		System.out.println("A()");
	}
	
	public void f(){
		System.out.println("A:f()");
	}
}

 class B extends A {
	B(){
		print("B()");
	}
	
	public void f(){
		print("B:f()");
	}
	public static void main(String []args) {
		B b=new B();
		b.f();
	}

}
