package strings;

public class NumberOfVowelsInStr {

	public static void main(String[] args) {
		String str = "java program";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch(ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': count++;	
			}
			
		}
		System.out.println(count);

	}

}
