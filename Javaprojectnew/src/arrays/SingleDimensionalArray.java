package arrays;

public class SingleDimensionalArray {

	public static void main(String[] args)
	{
		
		
		  int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		
			System.out.println("No of the arrays in :"+a.length);
			for(int i=0;i<=a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	
		//print of arrays reverse order arrays
			System.out.println("Arrays elements in reverse order: ");
			
			for(int i=a.length-1;i>=0;i--)
			{
				System.out.print(a[i]+ " ");
				
			}
			
			
	}

}
