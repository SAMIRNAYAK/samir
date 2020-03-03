package com.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFramework {

	public static void main(String[] args) throws Exception, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(6); 
		
		Callable<Integer> callable =  new Callable<Integer>()
		{  @Override 
			public Integer call() throws Exception 
		{ 
			for(int i=0;i<20;i++) {
				System.out.println("PING");
				try {
				Thread.sleep(500);
				}catch(InterruptedException e) {
				e.printStackTrace();
				}
				}
			return null; 
			} }; 
			
			Future<Integer> future = executor.submit(callable);
int result = future.get(); 
	}

}
