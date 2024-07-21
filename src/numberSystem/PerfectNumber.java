package numberSystem;
import java.util.Scanner;
public class PerfectNumber {
	public static boolean divisor(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num%i==0) {
				sum= sum+i;
			}
		}
		if(sum==num) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sacn.nextInt();
		if (divisor(n)) {
			System.out.println("perfect number");
		}else {
			System.out.println("not perfect number");
		}

	}

}
