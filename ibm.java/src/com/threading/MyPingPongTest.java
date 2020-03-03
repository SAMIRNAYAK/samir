package com.threading;

public  class MyPingPongTest implements Runnable{
	Thread t1,t2;
	public MyPingPongTest() {
	t1=new Thread(this);
	t2=new Thread(this);
	t1.setName("PING");
	t2.setName("PONG");
	t1.start();
	t2.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyPingPongTest();
	}
	
	
	@Override
	public void run() {
	Thread currentThread = Thread.currentThread();
	if(currentThread.getName().equals("PING")) {
	for(int i=0;i<20;i++) {
	System.out.println("PING");
	try {
	Thread.sleep(500);
	}catch(InterruptedException e) {
	e.printStackTrace();
	}
	}
	}
	else if(currentThread.getName().equals("PONG")){
	for(int i=0;i<20;i++) {
	System.out.println("\tPONG");
	try {
	Thread.sleep(300);
	}catch(InterruptedException e) {
	e.printStackTrace();
	}
	}
	}
	}

}
