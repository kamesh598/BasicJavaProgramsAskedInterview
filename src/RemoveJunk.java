
public class RemoveJunk 
{

	public static void main(String[] args) 
	{
		String s="$%#!@*()%$%^^ lating 123547";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
		String s1="@#$%! jaav $%^&*#@!^ testing #$%^&&^";
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
	}

}
