package com.test;

class Point{
	static double x,y,z;
	Point(double _x,double _y,double _z){
		x=_x;
		y=_y;
		z=_z;
	}
	static void setX(double a){
		x=a;            //��̬�����в����Ե��÷Ǿ�̬�ĳ�Ա����
		//print();        //��̬�����п���ֱ�ӵ��þ�̬����
	}
	static void  print1(){System.out.println("��̬����");}
	 void print(){
		System.out.println("����");
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
