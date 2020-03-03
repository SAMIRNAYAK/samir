package com.java1point8;
@FunctionalInterface
interface MathOperations{
	void operation(int a,int b) ;
	}

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations addition=(int a,int b) ->System.out.println(a+b);
		addition.operation(4,5);
		MathOperations subtract=(int a,int b) ->System.out.println(a-b);
		addition.operation(8,5);
		MathOperations multiply=(int a,int b) ->System.out.println(a*b);
		addition.operation(4,5);
		MathOperations divide=(int a,int b) ->System.out.println(a/b);
		addition.operation(10,5);
	}

}
