package com.test;
import java.awt.*;
import java.awt.event.*;

import javax.xml.soap.Text;
public class TFMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new TFFrame().launchFrame();
	}

}

class TFFrame extends Frame{
	TextField num1,num2,num3;//���������Ϊ��Ա����Ҳ���ԣ��Ǿֲ�����Ҳ��
	public void launchFrame(){
		num1=new TextField(10);
		num2=new TextField(10);
		num3=new TextField(15);
		Label lblPlus=new Label("+");
		Button btnEqual=new Button("=");
		btnEqual.addActionListener(new MyMonitor());
		setLayout(new FlowLayout());
		add(num1);
		add(lblPlus);
		add(num2);
		add(btnEqual);
		add(num3);
		pack();
		setVisible(true);
	}
	
	class MyMonitor implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int n1=Integer.parseInt(num1.getText());
			int n2=Integer.parseInt(num2.getText());
			num3.setText(""+(n1+n2));
			}
	}
}



//class MyMonitor implements ActionListener{
	/*
	TextField num1,num2,num3;
	public MyMonitor(TextField num1,TextField num2,TextField num3){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		
	}
	*/
/*
	TFFrame tf=null;
	public MyMonitor(TFFrame tf){//����ģʽ
		this.tf=tf;
	}
	public void actionPerformed(ActionEvent e){
	int n1=Integer.parseInt(tf.num1.getText());
	int n2=Integer.parseInt(tf.num2.getText());
	tf.num3.setText(""+(n1+n2));
	}
	
}
*/