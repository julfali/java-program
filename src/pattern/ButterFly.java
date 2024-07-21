package pattern;

public class ButterFly {

	public static void main(String[] args) {
		int num =3;
		for (int i = 1; i < num*2; i++) {
			for (int j = 1; j <num*2; j++) {
				if (i>=j && i+j<=2*num || i+j>= 2*num && i<=j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				}
				System.out.println();
			}

	}

}
