package numberPattern;

import java.util.Iterator;

public class ZeroOneBox {
	public static void main(String[] args) {
		int num = 3;
	    for (int i = 1; i < 2*num; i++) {
			for (int j = 1; j < 2*num; j++) {
			     if (i%2 != 0) {
					System.out.print(1+ " ");
				}else {
					System.out.print(0+ " ");
				}
				
			}
			System.out.println();
		}
	}

}
