package com.test;


import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFieldActionEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Tframe();
	}

}

class Tframe extends Frame{
	public Tframe() {
		// TODO Auto-generated constructor stub
	    TextField tf=new TextField();
	    add(tf);
	    tf.addActionListener(new TFActionListener());
	    tf.setEchoChar('*');
	    pack();
	    setVisible(true);
	}
}


class TFActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		TextField tf=(TextField)e.getSource();
		System.out.println(tf.getText());
		tf.setText("");
	}
	
}