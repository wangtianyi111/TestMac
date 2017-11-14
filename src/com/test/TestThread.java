package com.test;

public class TestThread implements  Runnable{
	int b=100;
	
	public synchronized void m1() throws Exception{
		b=1000;
	    Thread.sleep(10000);
	    System.out.println("b="+b);
	}
	
	public  synchronized void m2()throws Exception{
		Thread.sleep(2500);
		b=2000;
		System.out.println("m2.b="+b);
	}
	public void run() {
		try {
			m1();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		TestThread testThread=new TestThread();
		Thread t=new Thread(testThread);
		t.start();
		
		//Thread.sleep(2500);
		testThread.m2();
		System.out.println(testThread.b);
	}
	

}
