import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

//Approcah-1  using filereader bufferreader
		
		/*FileReader fr = new FileReader("F:\\doc.txt");
		
		BufferedReader br= new BufferedReader(fr);
		
		String str="";
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
			
		}
		br.close();
		*/
		
		
		//Approach-2 Using Scanner & File
		
		File file = new File ("F:\\doc.txt");
		Scanner s = new Scanner(file);
		
		/*while(s.hasNextLine())
		{
			System.out.println(s.nextLine());
		}*/
		
		//Approach-3
		
		s.useDelimiter("\\Z");
		System.out.println(s.next());
		
		
		
		
	}

}
