package strings;

import java.util.Scanner;

public class Pallidrome2 {
	
	public static boolean  reverse(String str) {
		int i = 0;
		int j= str.length()-1;
		while (i<j) {
			char ch = str.charAt(i);
			char ch2 = str.charAt(j);
			if (ch != ch2) {
				return false;
			}
			i++;
			j--;
		
		}	
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.next();
        if (reverse(str)) {
			System.out.println("pallindrom");
		}else {
			System.out.println("not pallindrome");
		}
	}

}
