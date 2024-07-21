package arrayssignment;

public class MaxOccOfElement {
	public static boolean contains(int[] aar, int ele) {
		for (int i = 0; i < aar.length; i++) {
			if (aar[i]==ele) {
				return true;
			}
		}
		return false;
	}
	public static int[]  remDup(int []arr) {
		int [] b = new int[arr.length];
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			if (!(contains(b, ele))) {
				b[k++]=ele;
			}
			
		}
		int [] c= new int[k];
		for (int i = 0; i <k; i++) {
		     c[i]=b[i];	
		}
		return c;
	}
	public static void freQuency(int [] arr) {
		int [] c= remDup(arr);
		int maxCount =0;
		int max=0;
		for (int i = 0; i < c.length; i++) {
			int a = c[i];
			int count =0;
			for (int j = 0; j < arr.length; j++) {
				int b =arr[j];
				if (a==b) {
					count++;
				}
			}
			if (count>maxCount) {
				maxCount = count;
				max = c[i];
			}
		}
		System.out.println(max+" has max occ  "+maxCount);
	}


	public static void main(String[] args) {
		int [] mainArr = {1,3,4,1,9,5,3};
		freQuency(mainArr);
		
	}

}
