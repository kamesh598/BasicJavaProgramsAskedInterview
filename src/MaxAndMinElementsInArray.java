
public class MaxAndMinElementsInArray 
{

	public static void main(String[] args) 
	{
				int a[]= {50,60,30,20,55};
				
				int max=a[0];
				for(int i=0;i<=a.length-1;i++)
				{
					if(a[i]>max)
					{
						max=a[i];
					}
				}
              System.out.println("Maximum Number of an array is " +max);
              
              
              int min=a[0];
              for(int i=1;i<a.length;i++)
              {
            	  if(a[i]<min)
            	  {
            		  min=a[i];
            	  }
              }
              System.out.println("Minimum number in array is: "+min);

	}

}
