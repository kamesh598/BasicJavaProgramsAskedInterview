
public class CountCharacterOccurannce {

	public static void main(String[] args) {


		String s="Java is a programing language";

int total_count=s.length();
int total_countafterremove=s.replace("a", "").length();
int count=total_count-total_countafterremove;
System.out.println("Total Number of Occurance: "+count);
		

	}

}
