package numberSystem;
import java.util.Scanner;
public class Pallindrome {
	public static boolean isPrime(int num) {
		int rev= 0;
		
		int temp = num;
		
		while (num!=0) {
			int lastDigit = num%10;
			rev = rev*10+lastDigit;
			num = num/10;
		}
		if (temp%rev==0) {
			return true;
		}return false;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   System.out.println("Enter a number");
			int n  = scan.nextInt();
			if (isPrime(n)) {
				System.out.println("prime number");
			}else {
				System.out.println(" not a prime number");
			}

	}

}
