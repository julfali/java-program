package pattern;

public class LeftPyramid {

	public static void main(String[] args) {
		int num = 3;
		for (int i = 1; i <num*2; i++) {
			for (int j = 1; j <=num; j++) {
			   if (i+j>= num+1&& i-j<num) {
				   System.out.print("* ");
			}else {
				System.out.print("  ");
			}
			}
			System.out.println();
		}

	}

}
