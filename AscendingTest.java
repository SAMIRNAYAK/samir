
class AscendingTest{
	public static void main(String []args) {
		int a[]=new int[20];
		for(int i=0;i<args.length;i++){
		a[i]=Integer.valueOf(args[i]);
	}
	for(int i=0;i<=args.length;i++){
		System.out.println(a[i]+"\t");
	}
	
		int temp=0;
  for(int i=0;i<=args.length;i++){
   for(int j=0;j<=args.length-i-1;j++){
    if (a[j]>a[j+1]){
		temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
	}
    }
	}
	for(int i=0;i<=args.length;i++){
		System.out.println(a[i]+"\t");
	}
	}
}
