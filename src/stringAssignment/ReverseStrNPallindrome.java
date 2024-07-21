package stringAssignment;
import java.util.Scanner;
public class ReverseStrNPallindrome {

	public static void main(String[] args) {
		//REVERSE A STRING
		
//		String name = "julfekar";
//		System.out.println(name);
//		String rev = "";
//		for (int i = name.length()-1; i >=0; i--) {
//			rev = rev+name.charAt(i);
//		}
//		System.out.println(rev);
		
		
		//pallindrome
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter string");
//		String str = scan.nextLine();
		String str = "abccba";
		if (isPallinDrome(str)) {
			System.out.println("pallindrome");
			
		}else {
			System.out.println(" not pallindrome");
		}
		
		

	}
	
	public static boolean isPallinDrome(String str) {
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev+str.charAt(i);		
			
		}
		if (rev == str) {
			return true;
		}return false;
	}
    

}
