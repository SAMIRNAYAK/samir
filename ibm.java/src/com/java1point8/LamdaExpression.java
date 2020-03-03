package com.java1point8;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LamdaExpression {
	public static void printList(List<Order> list,Predicate<Order> nonEmptyStringPredicate,Consumer<Order> consumer)
	{
		for(int i=0;i<list.size();i++)
		{
			if(nonEmptyStringPredicate.test(list.get(i)))
			{
				consumer.accept(list.get(i));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Order> order = new ArrayList<Order>();
		 OrderList l=new OrderList();
		 order=l.getOrders();
		 Predicate<Order> nonEmptyStringPredicate=
				 (Order s) ->
		 {
		      if(s.getLocation().equals("Accepted")||(s.getLocation().equals("Completed")))
		      {
		    	  if(s.getPrice()>10000)
		    	  {
		    		  return true;
		    	  }
		      }
		      return false;
		 };
		 Consumer<Order> consumer =
				 (Order o)->{
					 System.out.println(o);
				 };
			printList(order,nonEmptyStringPredicate,consumer);
		
		
		
		
	}

}
