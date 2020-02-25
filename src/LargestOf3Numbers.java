import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a = s.nextInt();
		System.out.println("Enter a Second Number:");
		int b=s.nextInt();
		System.out.println("Enter A Third Number");
		int c=s.nextInt();
		
		//Logic-1
		
			/*if(a>b && a>c)
			{
				System.out.println(a+ " is Largest number");
			}
			else if(b>a && b>c)
			{
				System.out.println(b+ " Is Largest Number");
			}
			else
				System.out.println(c+ " is Largest Number");
				*/
		
				
		//Logic-2 using Ternary Operator
		
		int  largest =c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest+ " is Largest Number");
		
		
				
		



	}

}
