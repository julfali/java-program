package strings;

import java.util.Scanner;

public class Pallindrome1 {
	
	public static String reverse(String str) {
		String result = "";
		for (int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			result = result+ch;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.next();
		String result  = reverse(str);
		if (str.equals(result)) {
			System.out.println("pallindrome");
		}else {
			System.out.println(" Not pallindrome");
		}
		
		

	}

}
