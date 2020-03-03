package com.generic;

public class GenericClass<T> {

	T obj; 
    GenericClass(T obj) {  this.obj = obj;  } 
    public T getObject()  { return this.obj; } 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass <Integer> iObj = new GenericClass<Integer>(15); 
        System.out.println(iObj.getObject()); 
   
       
        GenericClass <String> sObj = 
                          new GenericClass<String>("generic class"); 
        System.out.println(sObj.getObject()); 
        
	}

}
