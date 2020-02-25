
public class SumOfArray {

	public static void main(String[] args) 
	{
		int a[]= {5,6,7,8,9,10};
		int sum=0;
		/*for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}*/
		//System.out.println("Sum of Array is : " +sum);

//Enhanced for loop
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("Sum of Array is : " +sum);

	}

}
