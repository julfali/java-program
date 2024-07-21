package strings;
import java.util.Scanner;
public class RightRotation {
	
	public static String rightRotate(String str, int userInput) {
		String res = "";
		for (int i = str.length()-userInput; i < str.length(); i++) {
			res+=str.charAt(i);
		}
		for (int i = 0; i < str.length()-userInput; i++) {
		    res+=str.charAt(i);	
		}
		return res;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.next();
		System.out.println("enter a num");
		int index = scan.nextInt();
		System.out.println(rightRotate(str, index));

	}

}
