package com.threading;

public class Is_a_PingPong extends Thread{
	
	Thread t1,t2;
	public Is_a_PingPong(String ThreadName) {
	super.setName(ThreadName);
	super.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Is_a_PingPong("PING");
		new Is_a_PingPong("PONG");
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
