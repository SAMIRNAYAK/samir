package com.exception;

import java.io.File;
import java.io.FileInputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    File file=new File("F:\\javatrng\\filehandling\\read.txt");
    FileInputStream fis=new FileInputStream(file);
    StringBuilder sb = new StringBuilder();
    int i=0;
    do {
    	i=fis.read();
    	if(i!=-1) 
    		sb.append((char)i);
    	
    }
    while(i!=-1); 
    {
    	System.out.println("the content is:"+sb);
    	fis.close();
    }
	}

}
