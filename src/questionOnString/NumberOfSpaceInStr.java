package questionOnString;
import java.util.Scanner;
public class NumberOfSpaceInStr {
	public static int numberOfSpace(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.nextLine();
		System.out.println(numberOfSpace(str));

	}

}
