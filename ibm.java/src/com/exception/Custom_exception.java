package com.exception;


class InsufficientBalanceException extends Exception { //checked exception
	private String message;
	public InsufficientBalanceException() 
	{ 
		this.message = message;
	}
	public InsufficientBalanceException(String message)
	{ 
		this.message = message; 
		}
	public String toString()
	{
	return "Insufficient Balance." + this.message;
	}
	}

class Account { 
	public void setWithdraw(int balance,int withdraw) throws InsufficientBalanceException
	{ 
	if(withdraw > balance)
		throw new InsufficientBalanceException("insufficient" ); 
	else
	{
		System.out.println("amount is withdrawn");
	}
	} 
	}
public class Custom_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		try {
			a.setWithdraw(35,37);
			} 
		catch(InsufficientBalanceException e) 
		{ 
			e.printStackTrace();
			}

	}

}
