package array;

public class ReverseWord {

	public static void main(String[] args) {
		String str ="this is me";
		String [] s = str.split(" ");
		String res ="";
		for (int i = 0; i < s.length; i++) {
			if (i==s.length-1) {
				res+=reverse(s[i]);
			}else {
				res+=reverse(s[i])+" ";
			}
		}
		System.out.println(res);
	}
	
	public static String reverse(String str) {
		String res = "";
		for (int i = str.length()-1; i >=0; i--) {
			res+=str.charAt(i);
		}
		return res;
	}

}
