import java.util.*;

public class CounttheWordsinString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=s.nextLine();


int count=1;
for(int i=0;i<str.length()-1;i++)
{
	if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
	{
	
		count++;
	}
}

System.out.println("Number of Words: "+count);

	}

}
