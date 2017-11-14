package com.test;

import javax.lang.model.element.NestingKind;

public class TestToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
		System.out.println("d:="+d);
	}

}

class Dog{
	 public String toString(){
		 return "i'm a hot dog!";
	 }
}