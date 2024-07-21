package numberSystem;
import java.util.Scanner;
public class HarshadNumber {
	public static boolean isHarshad(int num) {
		int sum = 0;
		
		int temp = num;
		
		while (num!=0) {
			int lastDigit = num%10;
			sum = sum+lastDigit;
			num = num/10;
		}
		if (temp%sum==0) {
			return true;
		}return false;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   System.out.println("Enter a number");
			int n  = scan.nextInt();
			if (isHarshad(n)) {
				System.out.println("Harshad number");
			}else {
				System.out.println(" not a Harshad number");
			}
			

	}

}
