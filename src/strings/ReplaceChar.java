package strings;
import java.util.Scanner;
public class ReplaceChar {
	public static String replaceChar(String str, char ch, char char2bRep) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch2 = str.charAt(i);
			if (ch==ch2) {
				result = result+char2bRep;
			}else {
				result = result+ch2;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.next();
		System.out.println("enter a char");
		char ch = scan.next().charAt(0);
		System.out.println("enter a char To Replace ");
		char chTobe = scan.next().charAt(0);
		System.out.println("Replaced String is: "+replaceChar(str, ch, chTobe));	
	}

}
