package com.test;
import java.awt.*;

public class TestPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new PaintFrame().launchFrame();
	}

}


class PaintFrame extends Frame{
	 public void launchFrame(){
		 setBounds(200, 200, 640, 460);
		 setVisible(true);
	 }
	 
	 public void paint(Graphics p){
		 Color c=p.getColor();
		 p.setColor(Color.red);
		 p.fillOval(50, 50, 30, 30);
		 p.setColor(Color.black);
		 p.fillRect(80, 80, 40, 40);
		 p.setColor(Color.gray);
		 p.drawLine(100, 100, 200, 200);
		 p.setColor(c);
		 
	 }
}