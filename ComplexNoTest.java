class ComplexNo {
 private int real,img;
public  ComplexNo(int real, int img) 
	{	 
        this.real =real; 
        this.img=img; 
    } 
public int getReal()
		{
			return this.real;
		
		}
		public int getImg()
		{
			return this.img;
		
		}
  public ComplexNo add(ComplexNo n) 
    { 
        
        int myreal = this.real + n.real; 
  
        int myimg= this.img + n.img; 
  
        ComplexNo result = new ComplexNo(myreal,myimg);
		return result;
	}	
		public String toString(){
			return 
			this.getReal()+"+"+this.getImg()+"i";
		}
}

class ComplexNoTest
 {	
public static void main(String args[])
{	
 ComplexNo c1=new ComplexNo(5,4);
 ComplexNo c2=new ComplexNo(2,3);
 ComplexNo result = c1.add(c2);
 System.out.println("result=" + result);
}
	}