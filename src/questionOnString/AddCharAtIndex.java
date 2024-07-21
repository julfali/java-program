package questionOnString;
import java.util.Scanner;
public class AddCharAtIndex {
	public static String addChar(String str) {
		String replace = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char ch2 = 'b'; 
			if (str.contains("a")) {
				replace = replace+ch2;
			}
		}
		return replace;
		
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.nextLine();
		System.out.println(addChar(str));

		

	}

}
