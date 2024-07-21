package assignmentOnAlphabet;

import java.util.Iterator;

public class AaskOne {

	public static void main(String[] args) {
		int num = 3;
	    for (int i = 1; i < num*2; i++) {
	    	char ch = 'E';
	    	for (int j = 1; j < 2*num; j++) {
				if(i+j >= 2*num ) {
					System.out.print(ch-- +" ");
				}else {
					System.out.print("  ");
				}
			}
	    	System.out.println();
			
		}

	}

}
