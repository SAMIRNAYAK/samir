interface Printable{
void print();
}
class Employee implements Printable{
public void print(){
  System.out.println("employeee");
	}
}
class Circle implements Printable{
  public void print(){
  System.out.println("circle");
	}
}
 class PrintableTest{
	 
	 public static void printAll(Printable a[]){
		  for(int i=0;i<a.length;i++){
		  a[i].print();
		  }
	 }
  public static void main(String []args)
  {
	  
     Printable a[]=new  Printable[2];
		  a[0]=new Employee();
		  a[1]=new Circle();
		  Printable.PrintAll(a);
  }
 }
