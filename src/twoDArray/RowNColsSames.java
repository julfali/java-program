package twoDArray;
import java.util.Scanner;
public class RowNColsSames {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a num");
		int size = scan.nextInt();
		int [][] arr = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
