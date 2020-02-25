import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=s.nextInt();
		
		
		//1.using Alogorithm
		
		/*int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}*/
		
		//using stringbuffer class
		/*StringBuffer rev;
		 StringBuffer sb= new StringBuffer(String.valueOf(num));
		 rev=sb.reverse();*/
		
		//Using StringBuilder Class
		
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		
		
		
		System.out.println("Reverse Number is:"+rev);
	}

}
