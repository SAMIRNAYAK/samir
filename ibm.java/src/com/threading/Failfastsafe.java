package com.threading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Failfastsafe implements Runnable {
	Thread t1,t2;
	public Failfastsafe() {
	t1=new Thread(this);
	t2=new Thread(this);
	t1.setName("ADD");
	t1.setName("ITERATOR");
	t1.start();
	t2.start();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                new Failfastsafe();
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread currentThread = Thread.currentThread();
		if(currentThread.getName().equals("ADD")) {
		ArrayList<Integer> aL= new ArrayList<Integer>();
		aL.add(1);
		aL.add(20);
		}
		else if(currentThread.getName().equals("ITERATOR")) {
		ArrayList<Integer> aL=new ArrayList<Integer>();
		Iterator<Integer> itr = aL.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.hasNext());
			
		}}
	
		
		
		}
}

