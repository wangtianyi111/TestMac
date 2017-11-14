package com.test;

class Point{
	static double x,y,z;
	Point(double _x,double _y,double _z){
		x=_x;
		y=_y;
		z=_z;
	}
	static void setX(double a){
		x=a;            //静态方法中不可以调用非静态的成员变量
		//print();        //静态方法中可以直接调用静态方法
	}
	static void  print1(){System.out.println("静态方法");}
	 void print(){
		System.out.println("调用");
		print1();
	}
	double getDistance(Point p){
		return (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z);
		
	}
	
}

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point(3,4,5);
		Point p1=new Point(0, 0, 0);
		System.out.println(p.getDistance(p1));
		p.setX(4);
		System.out.println(p.getDistance(new Point(0,0,0)));

		p.print();
	}

}
