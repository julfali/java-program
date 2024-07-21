package numberSystem;
import java.util.Scanner;
public class XylemOrPholem {
	public static boolean isXylem(int num) {
		int num1 = num;
		int extSum =0;
		int meanSum = 0;
		while(num!=0) {
			int lastDigit = num%10;
			if(num == num1 || num<10) {
				extSum =extSum+lastDigit;
			}else {
				meanSum = meanSum+lastDigit;
			}
			num = num/10;
		}
		if (extSum == meanSum) {
			return true;
		}return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		if (isXylem(num)) {
			System.out.println("xylem");
		}else {
			System.out.println("pholem");
		}
	}

}
