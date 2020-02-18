class StackArray
{
private int ary[];
  public StackArray(int ary[])
	{
	this.ary=ary;
	}
	private int getTop()
	{
	for (int i=0;i<ary.length;i++)
	{
	if (ary[i]==0){
		return i;
	}
	}
			
	}
	public boolean push(int x){
		ary[getTop()]=x;
	}
	public int pop(){
		int val =ary[getTop()];
		ary[getTop()]=0;
		return val;
	}
	
}
public class TestStackArray{
	public static void main(String[]args)
	{
		StackArray.
		
	}
}
	