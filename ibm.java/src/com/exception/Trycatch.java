package com.exception;

public class Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		int y=0;
		try {
			System.out.println("came inside catch");
			int division1 = x / y;
			System.out.println("came out of try");
			}
		catch(ArithmeticException e)
		{ 
			System.out.println("came inside catch");
			e.printStackTrace();
			} 
	

}}
