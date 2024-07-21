package patternAssignment;

public class ReversePyramid {

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

	}

}
