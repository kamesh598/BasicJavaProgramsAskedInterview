import java.util.HashSet;

public class DuplicateElementsinArray 
{

	public static void main(String[] args) 
	{
		String s[]= {"java","python","Api","Soap","testNG","Java","api","soap"};
		
		//Approach1
		
		
		/*boolean flag=false;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					System.out.println("Found duplicate Element: "+s[i]);
				}
			}
		}

if(flag==false)
{
	System.out.println("Duplicate Element not found");
}
*/
		//Approach-2
		
		HashSet <String>hs=new HashSet();
		
		String s1[]= {"java","python","api","Soap","testNG","Java","Api","soap"};
		
		boolean flag=false;
		
		for(String len:s1)
		{
			
			if(hs.add(len)==false)
			{
			System.out.println("Duplicate Element Found: " +len);
			flag=true;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Duplicate Elemnts not found");
		}
		
		
		
		
		
	}

}
