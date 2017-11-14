package com.test;

import java.awt.*;
import java.awt.event.*;
public class TestActionEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame f=new Frame();
		f.setTitle("¼àÌýÆ÷");
		f.setBackground(Color.white);
		f.setSize(10, 10);
		f.setVisible(true);
		Button b=new Button("Press me!");
		f.add(b,BorderLayout.CENTER );
		Monitor m=new Monitor();
		b.addActionListener(m);
		f.pack();
	}

}

class Monitor implements ActionListener{
	public void actionPerformed(ActionEvent  e){
		System.out.println("a button has been pressed!");
	}
	
}
