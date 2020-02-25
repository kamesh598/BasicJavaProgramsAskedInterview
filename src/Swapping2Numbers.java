
public class Swapping2Numbers {

	public static void main(String[] args) {
		
		int a=10;int b=20;
		System.out.println("Before Swapping A&B values are--->"+a+" "+b);
		//Logic1 using temp variable
		
		/*int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping A&B values are--->"+a+"  "+b);*/
		
		//Logic 2 without using third  variable
		
		/*a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("values of A&B are---->"+a+" "+b);*/
		
		//Logic3
		
		/*a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("A&B Values are-->"+a+" "+b);*/
		
		//Logic4 using bitwise operator
		
		/*a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("A&B values are ===>"+a+" "+b);*/
		
		//Logic 5
		 b=a+b-(a=b);
		 
		 System.out.println("After swapping A&b Vlaues are:"+a+" "+b);
		
		
		

	}

}
