    abstract class Shape{
	abstract void draw();
		
	}
	class Line extends Shape 
	  void draw()
		{
		 System.out.println("circle is drawn");
		}
	class Rectangle extends Line
	 void draw()
		{
			System.out.println("Rectangle is drawn");
		}
	class Cube extends Rectangle
	 void draw()
		{
		 System.out.println("Cube is drawn")
		}
	Class ShapeTest{
	public static void main(String[]args)
	{
		Shape a[]=new Shape[3];
		a[0]=new Circle();
		a[1]=new Rectangle();
		a[2]=new Cylinder();
		
		
		for(int i=0;i<a.length;i++){
		a[i].draw();
		}
	}
	}