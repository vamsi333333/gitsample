package arrays;

public class SortingAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {5,2,7,1,3};
        int temp=0;
        System.out.println("before sorting of element");
        
        	for(int i=0;i<a.length;i++)
        	{
        		System.out.println(a[i]);
        		
             }
        	System.out.println();
        	for(int i=0;i<a.length;i++)
        	{
        		for(int j=i+1;j<a.length;j++)
        		{
        			if(a[i]>a[j])
        			{
        			   temp=a[i];
        			   a[i]=a[j];
        			   a[j]=temp;
        			}
        		}
        	}
        	System.out.println("after sorting the element are:");
        	for(int i=0;i<a.length;i++)
        	{
        		System.out.println(a[i]+ " ");
        	}

	}

}
