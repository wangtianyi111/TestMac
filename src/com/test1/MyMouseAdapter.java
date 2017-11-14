/*
 * 不可以放在com.test包下面，因为里面重写了Point的构造方法
 */
package com.test1;
                            
import java.awt.*;
import java.awt.Event;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;
import java.util.Iterator;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyMouseAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyFrame("drawing...");
	}

}

class MyFrame extends Frame{
	ArrayList points=null;
	public MyFrame(String s){
		super(s);
		points=new ArrayList<>();
		setVisible(true);
		setBackground(new Color(200, 200, 200));
		setBounds(300,300,400,400);
		this.addMouseListener(new Monitor3());	
		this.addWindowListener(new MyWindowMonitor());    //常规方法
	    /*
		this.addWindowListener(
				new WindowAdapter(){             //匿名类        第一种方法
					public void windowClosing(WindowEvent e){
						setVisible(false);
						System.exit(-1);
					}
				} );
				*/
	}
	
	class  MyWindowMonitor extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			setVisible(false);
			System.exit(-1);
		}
	}
	
	public void paint(Graphics g){
		Iterator t=points.iterator();
		while(t.hasNext()){
			Point p=(Point)t.next();
			g.setColor(Color.red);
			g.fillOval((int)p.x, (int)p.y, 10, 10);
		}
	}
	
	public void addPoint(Point p){
	    points.add(p);
	}
	
	
}


class Monitor3 extends MouseAdapter{
	public void mousePressed(MouseEvent e){
		MyFrame f=(MyFrame)e.getSource();
		Point p1=new Point(e.getX(),e.getY());
		f.addPoint(p1);
		f.repaint();
	}
	
}