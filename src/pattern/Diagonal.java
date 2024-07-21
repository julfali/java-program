package pattern;

public class Diagonal {

	public static void main(String[] args) {
		int num =3;
		for (int i = 1; i < num*2; i++) {
			for (int j = 1; j <num*2; j++) {
				if (i==1 || j==1 || i==2*num-1 || j==2*num-1 || i==j || i+j ==2*num) {  //(i+j)%num==0 we can write for last condition
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				}
				System.out.println();
			}

	}

}
