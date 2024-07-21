package numberSystem;
import java.util.Scanner;
public class SummationOfNuaturalNum {
	public static int sumOfNum(int num) {
		int sum =0;
		for(int i=1; i<=num; i++) {
			sum= sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num");
		int num = scan.nextInt();
		System.out.println(sumOfNum(num));

	}

}
