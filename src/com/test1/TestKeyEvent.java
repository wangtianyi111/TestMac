package com.test1;
import java.awt.*;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestKeyEvent {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyFrame().launchFrame();

	}

}

class KeyFrame extends Frame{
	 public void launchFrame(){
		 setSize(200,300);
		 setLocation(300,300);
		 addKeyListener(new MyKeyMonitor());
		 setVisible(true);
		 addWindowListener(new WindowAdapter(){
			 public void  windowClosing(WindowEvent e){
				 setVisible(false);
				 System.exit(-1);
			 }
		 });
		 
	 }
}


class MyKeyMonitor extends KeyAdapter{
	public void keyPressed(KeyEvent e){
		int keyCode=e.getKeyCode();
		if(keyCode==KeyEvent.VK_UP){
			System.out.println("up");
		}
	}
}
