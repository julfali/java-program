package pattern;

public class HalfButterFly {

	public static void main(String[] args) {
		int num =5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < 2*num; j++) {
				if (i>=j || i+j>=num*2) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				}
				System.out.println();
			}

	}

}
