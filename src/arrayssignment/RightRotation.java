package arrayssignment;
import java.util.Scanner;
public class RightRotation {
	public static void rightRotation(int [] arr) {
		int k =0;
		int [] b = new int[arr.length];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a num");
		int user = scan.nextInt();
		for (int i = user+1; i < arr.length; i++) {
			b[k++]=arr[i];
		}
		for (int i = 0; i <= user; i++) {
			b[k++] = arr[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,5,4};
		rightRotation(arr);

	}

}
