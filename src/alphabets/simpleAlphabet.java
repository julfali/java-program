package alphabets;

public class simpleAlphabet {

	public static void main(String[] args) {
		int num = 3;
		char ch = 'A';
		for (int i = 1; i < 2*num; i++) {
			for (int j = 1; j < 2*num; j++) {
				System.out.print(ch++ +" ");
				
			}
			System.out.println();
			
		}

	}

}
