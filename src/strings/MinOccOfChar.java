package strings;

import java.util.Iterator;
import java.util.Scanner;

public class MinOccOfChar {
	
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
	public static void minnOcc(String str) {
		int minCount = str.length();
		char minChar = ' ';
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
		    if (count< minCount) {
				minCount = count;
				minChar = ch1;
			}
		}
		System.out.println(minChar+": frequency is "+ minCount );
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.next();
		minnOcc(str);
		

	}

}
