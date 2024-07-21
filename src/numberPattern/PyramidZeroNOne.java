package numberPattern;

public class PyramidZeroNOne {

	public static void main(String[] args) {
		int num = 3;
	    for (int i = 1; i <=num; i++) {
	    	int n=1;
	    	int m= i-1;
			for (int j = 1; j < 2*num; j++) {
			     if (i+j >=num+1 && j-i<=num-1 ) {
			    	 if (j<=num) {
			    		 System.out.print(n++ +" ");
					}else {
						System.out.print(m-- +" ");
					}
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}

}
