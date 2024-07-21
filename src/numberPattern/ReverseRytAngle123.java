package numberPattern;

public class ReverseRytAngle123 {

	public static void main(String[] args) {
		int num = 3;
	    for (int i = 1; i < 2*num; i++) {
	    	int res = i;
			for (int j = 1; j < 2*num; j++) {
			     if (i+j <= 2*num) {
			    	 System.out.print(res++  +" ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}

}
