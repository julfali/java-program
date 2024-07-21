package strings;

public class OddIndexChar {

	public static void main(String[] args) {
		String str = "java";
		for (int i = 0; i < str.length(); i++) {
			if (i%2 != 0) {
				System.out.println(str.charAt(i));
			}
			
			
		}

	}

}
