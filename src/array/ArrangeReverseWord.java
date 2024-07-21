package array;

public class ArrangeReverseWord {

	public static void main(String[] args) {
		String  str = "Qspider to Welcome";
		String [] s =str.split(" ");
		String res ="";
		for (int i = s.length-1; i >= 0; i--) {
			if (i==0) {
				res = res+s[i];
			}else {
				res = res+s[i]+" ";
			}
		}
		System.out.println(res);
		

	}

}
