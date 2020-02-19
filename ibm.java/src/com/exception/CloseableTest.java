package com.exception;

interface AutoClosable
{
public void close()throws Exception;

}
class MyAutoClosable implements AutoCloseable {
@Override
public void close() throws Exception
{
System.out.println("MyAutoClosable closed!");
}
}

public class CloseableTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try(MyAutoClosable m1=new MyAutoClosable())
		{

		System.out.println("inside tryyyyyyyy");

		}

			
	}

}
