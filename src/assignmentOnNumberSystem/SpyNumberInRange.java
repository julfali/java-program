package assignmentOnNumberSystem;
import java.util.Scanner;
public class SpyNumberInRange {
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
	public static boolean prime(int num) {
		if(num==0 || num==1) return false;
		int count =0;
		for (int i = 1; i <=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}return false;  //this for else block
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n  = scan.nextInt();
//		if (spyNumber(n)) {
//			System.out.println("spy number");
//		}else {
//			System.out.println(" not a Spy number");
//		}
		
		//SPY number in range
//		System.out.println("lower a number");
//		int lower  = scan.nextInt();
//		System.out.println("higher a number");
//		int higher = scan.nextInt();
//		for(int i = lower; i<=higher; i++) {
//			if(isSpyNumber(i)) {
//				System.out.println(i);
//			}
//		}
		
		//finding prime from spy number
		int sum=0;
		System.out.println("lower a number");
		int lower  = scan.nextInt();
		System.out.println("higher a number");
		int higher = scan.nextInt();
		int i;
		for(i = lower; i<=higher; i++) {
			if(isSpyNumber(i)) {
				System.out.println("Spy number "+i);
			}
		}
		for(i = lower; i<=higher; i++) {
			if(isSpyNumber(i)) {
				for(int j =i; j<=i;j++) {
					if (prime(j)) {
						sum = sum+j;
						System.out.println("prime number " +j);
					}
				}
			}
		}
		System.out.println(sum);
		
	}

}
