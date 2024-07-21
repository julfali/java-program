package strings;

public class ToUpperCase {

	public static void main(String[] args) {
		String str = "java ProGram";
		System.out.println(str);
		System.out.println(toUpperCase(str));

	}
	
	public static String toUpperCase(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch>=97 && ch<=122) {
				ch-=32;
				res = res+ch;
			}else {
				res = res+ch;
			}
		}
		return res;
	}

}
