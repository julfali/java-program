package alphabets;

public class HollowABCD {

	public static void main(String[] args) {
		int num = 3;
		char ch = 'A';
		for (int i = 1; i <= num+1; i++) {
			for (int j = 1; j < 2*num; j++) {
				if (i+j > num+1) {
					System.out.print( ch++ +" ");	
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}

	}

}
