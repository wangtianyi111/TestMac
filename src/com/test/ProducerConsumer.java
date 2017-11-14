package com.test;

public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SyncStack ss = new  SyncStack();
		Producer p = new Producer(ss);
		Consumer c = new Consumer(ss);
		new Thread(p).start();
		new Thread(c).start();
		
	}
}
	class WoTou{
		int id;
	    public WoTou(int id ) {
			// TODO Auto-generated constructor stub
	    	this.id =id;
	    }
	    
	    public String toString(){
	    	return "WoTou:"+id;
	    }
	    
	}
	
	class SyncStack{
		int index=0;
		WoTou[] arrWoTou=new WoTou[6];
		
		public synchronized void push(WoTou wt){
			while(index==arrWoTou.length){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			this.notify();
			arrWoTou[index]=wt;
			index++;
		}
		
		public synchronized WoTou pop(){
			while(index==0){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			this.notify();
			index--;
			return arrWoTou[index];
		}
	}	
	
	class Producer implements  Runnable {
		SyncStack ss=null;
	    Producer(SyncStack ss) {
			// TODO Auto-generated constructor stub
			this.ss=ss;
		}
		
		public void run() {
			for (int i = 0; i <20; i++) {
				WoTou wt=new WoTou(i);
				ss.push(wt);
				System.out.println("生产了："+wt);
				try {
					Thread.sleep((int)(Math.random()*200));
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
	
	class Consumer implements  Runnable {
		SyncStack ss=null;
	    Consumer(SyncStack ss) {
			// TODO Auto-generated constructor stub
			this.ss=ss;
		}
		
		public void run() {
			for (int i = 0; i <20; i++) {
				WoTou wt;
				wt=ss.pop();
				System.out.println("消费了："+wt);
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}


