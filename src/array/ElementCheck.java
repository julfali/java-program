package array;

public class ElementCheck {
	public static boolean contains(int [] arr, int ele) {
		
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i]==ele ) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {1,5,33,-1,3};
		int ele = -1;
		System.out.println(contains(arr,ele));
	}

}
