import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int num=s.nextInt();
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
				
			}
			if(count==2)
				System.out.println(num+ " is prime number ");
			else
				System.out.println(num+ " Not a prime number ");
		}
		else
			System.out.println("Is not Prime Number");



	}

}
