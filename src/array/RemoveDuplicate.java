package array;

import java.util.Iterator;

public class RemoveDuplicate {
	public static boolean contain(int [] arr,int ele) {
		for (int i = 0; i < arr.length; i++) {
			 if (arr[i]==ele) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int [] arr = {1,2,1,4,3,2,1,5};
		int [] b = new int[arr.length];
		int k=0;
		for (int i = 0; i < b.length; i++) {
			int ele = arr[i];
			if (contain(b, ele)) {
				b[k++]=ele;
			}
		}
		for (int i = 0; i <k; i++) {
			System.out.println(b[i]);
		}

	}

}
