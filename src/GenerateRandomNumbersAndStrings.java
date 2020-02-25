import java.util.Random;

public class GenerateRandomNumbersAndStrings 
{

	public static void main(String[] args) 
	{
//Approch1--Random
		
		Random rand = new Random();
		int rand_int=rand.nextInt(100);
		System.out.println(rand_int);


	}

}
