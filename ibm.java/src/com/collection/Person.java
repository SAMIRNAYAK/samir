package com.collection;

import java.util.Iterator;
import java.util.TreeSet;
class PersonCompare1 implements Comparable<PersonCompare1>{
String name;
int weight;
int height;
public PersonCompare1(String name, int weight, int height) {
super();
this.name = name;
this.weight = weight;
this.height = height;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getWeight() {
return weight;
}
public void setWeight(int weight) {
this.weight = weight;
}
public int getHeight() {
return height;
}
public void setHeight(int height) {
this.height = height;
}
@Override
public int compareTo(PersonCompare1 pc) {

if(this.weight!=pc.weight) {	
if(this.weight > pc.weight) {
return 1;
}
else if (this.weight < pc.weight){
return -1;
}


else {
return 0;
}

}
else {
	if(this.height > pc.height) {
		return 1;
		}
		else if (this.height < pc.height){
		return -1;
		}


		else {
		return 0;
		}
}
}
@Override
public String toString() {
return "PersonComare [name=" + name + ", weight=" + weight + ", height=" + height + "]";
}
 }


public class Person {
	private static  void checkTreeSet() {
		TreeSet<PersonCompare1> treeSet = new TreeSet<PersonCompare1>();
		treeSet.add(new PersonCompare1("Aditya",48,3));
		treeSet.add(new PersonCompare1("Samir",48,1));
		treeSet.add(new PersonCompare1("Ram",43,4));
		treeSet.add(new PersonCompare1("Modi",42,2));

		Iterator<PersonCompare1> itr = treeSet.iterator();
		while(itr.hasNext()) {
		PersonCompare1 a = itr.next();
		System.out.println(a);
		}
		}
	public static void main(String[] args) {
		checkTreeSet();
		}}
		
		