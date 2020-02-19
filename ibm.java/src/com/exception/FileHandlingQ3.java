package com.exception;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class FileHandlingQ3 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		File file = new File("F:\\javatrng\\filehandling\\3accounts");
		
		FileOutputStream fos = new FileOutputStream(file); 
		DataOutputStream dos = new DataOutputStream(fos); 
		dos.writeInt(23);
		dos.writeInt(23);
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();
		
	}

}
