import java.util.Arrays;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		/*int key=12;
		int l=0;
		int h=arr.length-1;
		boolean flag=false;
		
		
		while(l<=h)
		{
			int m=(l+h)/2;
			if(arr[m]==key)
			{
				System.out.println("Element found ");
				flag=true;
				break;
			}
			
			if(arr[m]<key)
			{
				l=m+1;
			}
			if(arr[m]>key)
			{
				h=m-1;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Element Not Found");
		}*/
		
		//Approach-2
		
		System.out.println(Arrays.binarySearch(arr, 5));
		
		



	}

}
