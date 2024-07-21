package arrayssignment;

public class MinOccOfElement {
	public static boolean isPresent(int [] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			 if (arr[i]==ele) {
				return true;
			}
		}
		return false;
	}
	public static int [] remDup(int [] arr) {
		int b [] = new int[arr.length];
		int k=0;
		for (int i = 0; i < b.length; i++) {
			int ele=arr[i];
			if (!(isPresent(b, ele))) {
				b[k++] = arr[i];
			}
		}
		int [] c = new int[k];
		for (int i = 0; i < c.length; i++) {
			 c[i]=b[i];
		}
		return c;
	}
	public static void minOcc(int [] arr) {
		int minCount=arr.length;
		int minEle=0;
		int [] b = remDup(arr);
		for (int i = 0; i < b.length; i++) {
			int a = b[i];
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				int d = arr[j];
				if (a==d) {
					count++;
				}
			}
			if (count<minCount) {
				minCount=count;
				minEle=a;
			}	
		}
		System.out.println(minEle+" has min occu "+minCount);
	}

	public static void main(String[] args) {
		int [] mainArr = {1,3,4,1,9,5,3};
		minOcc(mainArr);
	}

}
