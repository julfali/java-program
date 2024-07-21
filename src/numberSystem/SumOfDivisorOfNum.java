package numberSystem;
import java.util.Scanner;
public class SumOfDivisorOfNum {
	public static int divisor(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				sum= sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sacn.nextInt();
		System.out.println(divisor(n));
	}

}
