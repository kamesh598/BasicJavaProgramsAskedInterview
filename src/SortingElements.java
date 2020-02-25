import java.util.Arrays;
import java.util.Collections;

public class SortingElements 
{

	public static void main(String[] args) 
	{
		Integer arr[]= {1,5,9,7,2,4,6};
		
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		
		//Arrays.parallelSort(arr);
		
		//Arrays.sort(arr); //Ascending Order
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		System.out.println("After Sorting: "+Arrays.toString(arr));



	}

}
