import java.util.Scanner;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		//1.Using String Concatenation Operator
		
		String str ="ABCD";
		String rev="";
		
		/*int len = str.length();  //4
		
		for(int i=len-1;i>=0;i--)   //i=3
		{
			rev=rev+str.charAt(i);   //i=D
			
		}
		System.out.println("Reverse Variable:"+rev);*/
		
		//2.Using Character Array
		
		/*char a[]=str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse String:"+rev);*/
		
		//3.Using StringBuffer Class
		
		StringBuffer sb=new StringBuffer(str);
System.out.println("Reverse String:"+sb.reverse());

	}

}
