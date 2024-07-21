package arrayssignment;

public class ReplaceOddIndx {

	public static void main(String[] args) {
		int [] arr = {2,5,3,7,8,9,7,4};
		int count =500;
        for (int i = 0; i < arr.length; i++) {
			if (i%2!=0) {
			    arr[i]=count;
			}else {
				arr[i]=arr[i];
			}
		}
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
