package strings;

public class ToLoweCase {

	public static void main(String[] args) {
		String str = "java ProGram";
		System.out.println(str);
		System.out.println(toLowerCase(str));
	}
	public static String toLowerCase(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch>=65 && ch<=90) {
				ch+=32;
				res = res+ch;
			}else {
				res = res+ch;
			}
		}
		return res;
	}

}
