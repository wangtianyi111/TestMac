package com.test;

class  SuperClass{
	private int  n;
	
	public SuperClass() {
		// TODO Auto-generated constructor stub
		System.out.println("SuperClass");
	}
	
    public SuperClass(int n){
    	System.out.println("SuperClass:"+n);
    	this.n=n;
    	
    }
}

class SubClass extends SuperClass{
	private int n;
	
	SubClass(){
		super(300);
		System.out.println("SubClass");
		
	}
    
	SubClass(int n){
		System.out.println("SubClass()");
		this.n=n;
	}
	
	
}
public class TestSuperSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SubClass sc1=new SubClass();
		SubClass sc2=new SubClass(200);
		//System.out.println(sc2.n);

	}

}
