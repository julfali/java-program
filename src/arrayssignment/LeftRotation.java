package arrayssignment;
import java.util.Scanner;
public class LeftRotation {
	public static void name(int [] arr) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a num");
		int user=scn.nextInt();
		int [] b = new int[arr.length];
		int k =0;
		for (int i = user; i < arr.length; i++) {
		     b[k++]=arr[i];	
		}
		
		for (int j = 0; j < user; j++) {
			b[k++]=arr[j];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}

		
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,5,4};
		name(arr);
	}

}
