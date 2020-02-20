package com.exception;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandlingQ3 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		File file = new File("F:\\javatrng\\filehandling\\3accounts");
		FileOutputStream fos = new FileOutputStream(file); 
		DataOutputStream dos = new DataOutputStream(fos); 
		dos.writeInt(23);
		dos.writeDouble(23.00);
		dos.writeUTF("Samir"); 
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		int id=dis.readInt();
		Double balance=dis.readDouble();
		String name=dis.readUTF();
		
		System.out.println("accnt id is:"+id);
		System.out.println("accnt balance is:"+balance);
		System.out.println("accnt name is:"+name);
	}

}
