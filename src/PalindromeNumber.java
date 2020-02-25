import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter  Number:");
		int num=s.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev)
		{
			System.out.println("Palindrome Number==>"+org_num);
		}
		else
			System.out.println("Not plaindrome==>"+org_num);
	}

}
