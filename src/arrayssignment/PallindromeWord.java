package arrayssignment;
import java.util.Scanner;
public class PallindromeWord {
	public static String reverseSTR(String str) {
		String  res ="";
		for (int i = str.length()-1; i >=0; i--) {
			if (str.length()>1) {
				 res+=str.charAt(i);	
			}			
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("plz enter a sentence");
		String str = scan.nextLine();
		String [] s = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(reverseSTR(s[i]))) {
				System.out.print(s[i]+" ");
			}
		}
	}

}
