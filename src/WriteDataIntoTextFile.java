import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
 FileWriter fw = new FileWriter("F:\\doc1.txt");
 BufferedWriter bw = new BufferedWriter(fw);
 bw.write("Selenium with java");
 bw.write("Selenium wiht python");
 
 System.out.println("Writing data into file is Finised");
 
 bw.close();

	}

}
