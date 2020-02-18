class Booking{
	  private int from;
	  private int to;
	  private int seatNo;
	  private int price;
  public  Booking(){
	  this.to=to;
	  this.seatNo=seatNo;
	  this.price=price;
  }
  
  public busPrice(){
	  super(int from,int to,int seatNo,int price);
	  this.to=to;
	  this.seatNo=seatNo;
	  this.price=price;
    }
  public railwayPrice(int seatType){
	  super(int from,int to,int seatNo,int price);
	  this.to=to;
	  this.seatNo=seatNo;
	  this.price=price;
	  this.seatType=seatType;
    }
  
  public flightPrice(int luggage){
	  super(int from,int to,int seatNo,int price);
	  this.to=to;
	  this.seatNo=seatNo;
	  this.price=price;
	  this.luggage=luggage;
	  if (luggage>15){
		  this.price+=(0.03*this.price)
	  }
    }
   public int getBusPrice(){
     return this.price;
    }
    public int getRailwayPrice(){
     return this.price;
    }
    public int getFlightPrice(){
     return this.price;
    }
    
  }
    public String toString(){
       
  }
  
  
  class BookingPrice{
   public static void main (String[]args){
   
		Booking a=new Booking();
		Booking b=new Booking();
		Booking c=new Booking();
		
		A=a.getBusPrice();
		B=a.getRailwayPrice();
		C=a.getFlightPrice();
		double D=A+B+C+(0.01*C)
		double E=D+(0.02*D)
		System.out.println("Total price=" + D)
    }
   
  }