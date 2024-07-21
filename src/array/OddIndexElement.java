package array;

public class OddIndexElement {

	public static void main(String[] args) {
		int [] arr = {1,7,8,9, 11, 13,44,};
        for (int i = 0; i < arr.length; i++) {
			if (i%2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
