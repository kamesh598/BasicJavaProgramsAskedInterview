import java.util.Arrays;
import java.util.Scanner;

public class ReverseEachwordinString 
{

	public static void main(String[] args) 
	{
		/*System.out.println("Enter A String: ");
		Scanner s =new Scanner(System.in);
		String str =s.next();*/
		String str = "Welcome to java selenium";
		
		/*String[] words= str.split(" ");//splitting string into words
		//System.out.println("Splitting string " +Arrays.toString(words));
		
		String revstr="";	
		
		for(String w:words)
		{
			String revword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revword=revword+w.charAt(i);
			}
			revstr=revstr+revword+" ";
		}
		System.out.println("Rverse string is "+revstr);*/
		
		String s = "Welcomt ot hyd";
		
		String[] words=s.split("\\s");
		
		String revword="";
		
		for(String w:words)
		{
			StringBuilder sd = new StringBuilder(w);
			sd.reverse();
			revword=revword+sd.toString()+" ";
		}
		System.out.println(revword);
				


	}

}
