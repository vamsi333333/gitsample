package polymorphism;
public class MethodOverLoading {
	void sum (int a,int b)
	{
		int res=a+b;
		System.out.println(res);
		
	}
	void sum(float a,float b)
	{
		 float  res =a+b;
		 System.out.println(res);
		
	}
	
	void sum() 
	{
		int x =10;int y=20;
		int res=x+y;
		System.out.println(res);
		
	}
	void sum(String a,String b)
	{
		String res=a+b;
		System.out.println(res);
		  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading obj=new MethodOverLoading();

         obj.sum();
         obj.sum("10","20");
         
	}

}
