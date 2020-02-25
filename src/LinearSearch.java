
public class LinearSearch 
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,50,40};
		int Search_ele=50;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			if(Search_ele==a[i])
			{
				System.out.println("Element foud at: "+i);
				flag=true;
				break;
				
			}
		}
if(flag==false)
System.out.println("Element not found");

	}

}
