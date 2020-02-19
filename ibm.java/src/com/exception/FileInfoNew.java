package com.exception;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

public class FileInfoNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String name;
		int date;
		try {
		File file=new File("F:\\javatrng\\filehandling\\read.txt");
		FileOutputStream fos= new FileOutputStream(file);
		a=(int) file.length();
		name=file.getName();

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("name "+name+"  whose length is: "+a+"and was last modified in : "+sdf.format(file.lastModified()));
		fos.close();
		}
		catch(Exception e) {
		e.printStackTrace();
		}
	}

}
