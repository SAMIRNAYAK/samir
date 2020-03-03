package com.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Date implements Serializable{
	/**
	 * 
	 */
	public static final long serialversionUID=2l;
transient private  int day;
private String month;
private int year;
public Date(int day, String month, int year) {
super();
this.day = day;
this.month = month;
this.year = year;
}
public int getDay() {
return day;
}
public void setDay(int day) {
this.day = day;
}
public String getMonth() {
return month;
}
public void setMonth(String month) {
this.month = month;
}
public int getYear() {
return year;
}
public void setYear(int year) {
this.year = year;
}

@Override
public String toString() {
return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
}

}

public class SerialzeDeserialize {
	
	public static void writeObject(Date dob) throws Exception{
		File file =new File("F:\\javatrng\\filehandling\\acnt_serialize.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dob);
		oos.flush();
		fos.flush();
		oos.close();
		fos.close();
		}
		public static Date readObject() throws Exception{
		File file =new File("F:\\javatrng\\filehandling\\acnt_serialize.dat");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Date dob = (Date)ois.readObject();
		ois.close();
		fis.close();

		return dob;
		}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Date dob =new Date(24,"March",2020);
		//writeObject(dob);
		System.out.println("Reading dob = "+readObject());
	}

}
