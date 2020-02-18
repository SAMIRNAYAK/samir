

@Deprecated class Order{
   
  private double price=35;
   private double quantity=20;
   @Override 
    public String toString()
	{
   return " " + this.price + " " +this.quantity;
   }
 
}


class OrdersAnnotations{
 @SuppressWarnings (("......."))
 public static void main(String []args){
  
	Order order =new Order();
	System.out.println(order);

 }
}