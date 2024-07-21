package array;

public class EvenElementOfArray {

	public static void main(String[] args) {
		int [] arr = {1,10,7,3,11,12,14,13,45,10};
        for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
