package com.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file1=new File("F:\\javatrng\\filehandling\\read.txt");
		File file2=new File("F:\\javatrng\\filehandling\\write.txt");
  FileInputStream fis1=new FileInputStream(file1);
  FileInputStream fis2=new FileInputStream(file2);
  SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
  int i;
  while((i=sis.read())!=-1){
	  System.out.print((char)i);
  }
sis.close();
fis1.close();
fis2.close();
	}

}
