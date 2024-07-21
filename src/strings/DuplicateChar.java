package strings;
import java.util.Scanner;

public class DuplicateChar {
	public static String dupRemove(String str) {
		String res = "";
	    for (int i = 0; i < str.length(); i++) {
	    	
			char ch = str.charAt(i);
			if (!(res.contains(ch+""))) {
				res = res+ch;
			}
	   }
	    return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.next();
		System.out.println(dupRemove(str));

	}

}
