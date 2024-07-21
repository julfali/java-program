package strings;

import java.util.Scanner;

public class PossibleSubstr {
	
	public static void possibleSubString(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				for (int k = i; k <=j; k++) {
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.next();
		possibleSubString(str);

	}

}
