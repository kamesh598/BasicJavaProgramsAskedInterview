import java.util.Arrays;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		int arr[]= {4,5,8,1,3,2,6,7};
		
		System.out.println("Before Sorting "+Arrays.toString(arr));
		
		int len=arr.length;
		
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array After Sorting: "+Arrays.toString(arr));
		

	}

}
