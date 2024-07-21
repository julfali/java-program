package patternPractice;

public class PscalTriangle {

	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <=num; i++) {
			int n =1;
			int m = i-1;
			for (int j = 1; j <2*num; j++) {
				if (i+j>=num+1 && j-i<num) {
					 if (j<=num) {
						System.out.print(n++ +" ");
					}else {
						System.out.print(m-- +" ");
					}
//					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}

	}

}
