package com.exception;

import java.io.File;
import java.io.FileOutputStream;

public class ReadFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
File file =new File("F:\\javatrng\\filehandling\\write.txt");
FileOutputStream fos=new FileOutputStream(file);
String strData="this is written";
fos.write(strData.getBytes());
fos.flush();
fos.close();
	}

}
