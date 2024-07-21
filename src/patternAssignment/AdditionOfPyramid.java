package patternAssignment;

public class AdditionOfPyramid {

	public static void main(String[] args) {
		int num = 3;
		for (int i = num; i <=num+2; i++) {
			for (int j = 1; j <num*2; j++) {
			   if ( i-j<=num-1 && i+j<num*3) {
				   System.out.print("* ");
			}else{
				
				System.out.print("  ");
			}
		}
		System.out.println();
		}
		int num2 = 3;
		for (int i = 1; i <=num2; i++) {
			for (int j = 1; j <num2*2; j++) {
			   if (i+j>=num2+1 && j-i<num2) {
				   System.out.print("* ");
			}else {
				System.out.print("  ");
			}
			}
			System.out.println();
		}

	}

}
