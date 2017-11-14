package com.test;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c1=new Cat(1,2,3);
		Cat c2=new Cat(1,2,3);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
	}

}

class Cat{
	int color;
	int height,weight;
	public Cat(int color,int height,int weight){
		this.color=color;
		this.weight=weight;
		this.height=height;
		
	}
	
	public boolean equals(Object obj){
	if(obj==null) return false;
	else { 
		if(obj instanceof Cat){
			Cat c=(Cat)obj;
			if(c.color==this.color&&c.height==this.height&&c.weight==this.weight){
				return true;
			}
		}
		
	}
	return false;
}
	
}

