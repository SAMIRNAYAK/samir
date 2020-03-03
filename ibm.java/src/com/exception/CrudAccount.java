package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

class Account{
	private  int id;
	private  String name;
	private  double balance;
	public Account() {
		
	}
	public Account(int id,String name,double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}


public class CrudAccount {
	
	
	public static void create() throws Exception{
		
		
	}

	
		
		
		
		
		public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
File file =new File("F:\\javatrng\\filehandling\\crud_accnt");
RandomAccessFile raf =new RandomAccessFile(file,"rw");
raf.writeInt(23);
raf.writeUTF("samir");
raf.writeDouble(23.00);
long pointer=raf.getFilePointer();
raf.seek(0);
int id=raf.readInt();
String name=raf.readUTF();
Double salary=raf.readDouble();
System.out.println("id="+id);
System.out.println("name="+name);
System.out.println("salary="+salary);
	}

}
