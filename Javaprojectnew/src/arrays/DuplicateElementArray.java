package arrays;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     int a[]= {5,3,4,5,4,7,3,3};
		     for(int i=0;i<a.length;i++)
		     {
		    	 int count=1;
		    	 for(int j=i+1;j<a.length;j++)
		    	 
		    	 {
		    		if(a[i]==a[j])
                         {
	                        count++;
                               }
		    		else
		    		{
		    			break;
		    		}
		    		if (count>1)
		    		{
		    			System.out.println(a[i] + "is repeated"+ count+"times");
		    			i=i+(count-1);
		    			
		    		}
                     
		    	 }
		     }

	}

}
