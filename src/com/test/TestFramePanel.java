package com.test;

import java.awt.*;


public class TestFramePanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		MyFrame m1=new MyFrame("´°¿Ú1",300,200, 600, 400);
	}
	
}



class MyFrame extends Frame {
		private Panel p1;
		public MyFrame(String s,int x,int y,int w,int h ) {
			// TODO Auto-generated constructor stub
			super(s);
			setLayout(new FlowLayout(FlowLayout.LEFT));
			p1=new Panel(null);
			p1.setBackground(Color.yellow);
			setBackground(Color.blue);
			p1.setSize(200,200);
			
			add(p1);
			setBounds(x,y,w,h);
			setVisible(true);
			
			
		}
}
