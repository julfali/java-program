package stringAssignment;

public class StringPallindrome {

	public static void main(String[] args) {
		String str = "abccba";
		if (isPallinDrome(str)) {
			System.out.println("pallindrome");
		}else {
			System.out.println(" not pallindrome");
		}
		

	}
	public static boolean isPallinDrome(String str) {
		str = str.toLowerCase();
		if (str == null || str.length()==0) return true;
		for (int i = 0; i <= str.length()/2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length()-1-i);
			if (start != end) {
				return false;
			}
			
		}
		return true;
	}

}
