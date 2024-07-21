package strings;
import java.util.Scanner;
import java.util.Iterator;

public class FrequencyOfChar2 {
	public static String remDup(String str){
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!(res.contains(ch+""))) {
				res = res+ch;
			}
		}
		return res;
	}
	
	//function to compare to tring
	public static void frequecy(String str) {
		String result = remDup(str);
		for (int i = 0; i < result.length(); i++) {
			int count =0;
			char ch1 = result.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				char ch2 = str.charAt(j);
				if (ch1 == ch2) {
				   count++;	
				}
			}
			System.out.println(ch1 + " frequency is: "+count);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
		frequecy(str);
		//System.out.println(remDup(str));

	}

}
