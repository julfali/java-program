package strings;

import java.util.Scanner;

public class SumofDigitInstr {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.next();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch>=48 && ch<=57) {
				ch-=48;
				sum +=ch;
		      }
			
		}
		System.out.println(sum);
		

	}

}
