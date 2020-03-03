package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fruit {
	public String name; 
	public int calories; 
	public int price; 
	public String color;

	public Fruit() {
	}

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]" ;
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ArrayList<Fruit> list = new ArrayList<Fruit>() {
            {
            	add(new Fruit("Apple", 100,80,"red"));
            	add(new Fruit("Orange", 200,90,"orange"));
            	add(new Fruit("Banana", 300,100,"yellow"));
            }
        };
//question 1
    /*   List<Fruit> listSorted = new ArrayList<Fruit>();
        Comparator<Fruit>  CalorieCommparator = Comparator.comparing(Fruit::getCalories);
        listSorted = list.stream().sorted(CalorieCommparator.reversed()).collect(Collectors.toList());
       System.out.println(listSorted);*/
    
        //question 2
      
        //List<String> colorlist = list.stream() .map(Fruit::getColor) .collect(Collectors.toList());
        //System.out.println(colorlist);

 //question 3
        List<Fruit> listSorted = new ArrayList<Fruit>();
        Comparator<Fruit>  priceComparator = Comparator.comparing(Fruit::getPrice);
        listSorted = list.stream().sorted(priceComparator).collect(Collectors.toList());
       System.out.println(listSorted);
    
}
	}
