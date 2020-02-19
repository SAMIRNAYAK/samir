package com.exception;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
     File file =new File("F:\\javatrng\\filehandling");
     
     String[] files = file.list();
     for (int i = 0; i < files.length; i++) { 
         System.out.println(files[i]); 
     } 
		}
		catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
		
		
	}
}
