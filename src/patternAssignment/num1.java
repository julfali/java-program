package patternAssignment;

public class num1 {

	public static void main(String[] args) {
		int num = 3;
		for (int i = 1; i < 2*num; i++) {
			int count =1;
			for (int j = 1; j < 2*num; j++) {
			   if ( i<=j) {
				   System.out.print(count++ +" ");
			}else{
				
				System.out.print("  ");
			}
		}
		System.out.println();
		}

	}

}
