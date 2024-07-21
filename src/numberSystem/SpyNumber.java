package numberSystem;
import java.util.Scanner;
public class SpyNumber {
	public static boolean isSpyNumber(int num) {
		int sum = 0;
		int product =1;
		int temp = num;
		
		while (num!=0) {
			int lastDigit = num%10;
			sum = sum+lastDigit;
			product = product*lastDigit;
			num = num/10;
		}
		if (sum==product) {
			return true;
		}return false;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	   System.out.println("Enter a number");
		int n  = scan.nextInt();
		if (isSpyNumber(n)) {
			System.out.println("spy number");
		}else {
			System.out.println(" not a Spy number");
		}
		

	}

}
