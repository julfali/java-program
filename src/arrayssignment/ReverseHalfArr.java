package arrayssignment;

public class ReverseHalfArr {
	
	public static void reverseHalfArr(int [] arr) {
		int [] b = new int[arr.length];
		int k =0;
		for (int i = (arr.length)/2; i >=0; i--) {
			b[k++]=arr[i];
		}
//		k=(arr.length)/2;
		for (int i = (arr.length)/2+1 ; i < arr.length ; i++) {
			 b[k++]=arr[i];
		}
		for (int i = 0; i < k; i++) {
			System.out.print(b[i]+" ");
		}
	}

	public static void main(String[] args) {
		int [] arr = {1,2,6,5,4};
		reverseHalfArr(arr);

	}

}
