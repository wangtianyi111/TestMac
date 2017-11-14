package com.test;

public class TestLianxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workman workman=new Workman("王天羿");
		workman.food();
		workman.play();

	}

}

interface CarePet{
	public void food();
	public void play();
}

class Workman implements CarePet{
	String name;
	
	Workman(String name){
		this.name=name;
	}
	
	public void food(){
		System.out.println(name+"在喂食！");
	}
	
	public void play(){
		System.out.println(name+"在和宠物玩！");
	}
}