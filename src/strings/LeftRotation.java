package strings;
import java.util.Scanner;
import java.util.Scanner;

public class LeftRotation {
	
	public static String leftRotate(String str, int userInput) {
		String res = "";
		for (int i = userInput; i < str.length(); i++) {
		     res+=str.charAt(i);	
		}
		for (int i = 0; i < userInput; i++) {
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
		System.out.println(leftRotate(str, index));
	}

}
