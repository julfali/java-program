package strings;

import java.util.Scanner;

public class MaxOccOfChar {
	public static String remDup(String str) {
		String result ="";
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (!(result.contains(ch1+""))) {
				result = result+ch1;
			}
		}
		return result;
	}
	public static void maxnOcc(String str) {
		int maxCount = 0;
		char maxChar = ' ';
		String res = remDup(str);
		for (int i = 0; i < res.length(); i++) {
			int count = 0;
			char ch1 = res.charAt(i) ;
		     for (int j = 0; j < str.length(); j++) {
				char ch2 = str.charAt(j);
				if (ch1==ch2) {
					count++;
				}
			}
		    if (count > maxCount) {
				maxCount = count;
				maxChar = ch1;
			}
		}
		System.out.println(maxChar+": frequency is "+ maxCount );
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.next();
		maxnOcc(str);
       
	}

}
