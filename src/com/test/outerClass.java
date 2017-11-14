package com.test;
class Outer{
	String out_String="kill the cat";
	void fun(){
		Iner in=new Iner();
		in.print();
	}
	class Iner{
		void print(){
			System.out.println(out_String);
			System.out.println("use\'"+out_String+"\'");
		}
	}
}
public class outerClass {
	public static void main(String[] args){
		Outer out=new Outer();
		out.fun();
	}

}
