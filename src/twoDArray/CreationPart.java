package twoDArray;
import java.util.Scanner;
public class CreationPart {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a num");
		int size = scan.nextInt();
		int [][] arr = new int[size][size]; 
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
        arr[0][0]=5;
        arr[0][1]=7;
        System.out.println(arr[0][0]); //5
        System.out.println(arr[0][1]); //7
	}

}
