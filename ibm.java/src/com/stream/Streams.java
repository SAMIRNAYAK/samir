package com.stream;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> name=new ArrayList<String>();
name.add("Samir");
name.add("Amir");
name.add("Famir");
List<String> result = name.stream().filter((String nam)->nam.startsWith("A")). 
collect(Collectors.toList()); 
System.out.println(result);

	}

}
