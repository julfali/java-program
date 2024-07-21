package assignmentOnNumberSystem;
import java.util.Scanner;
public class SumOfHigherNLowerPrime {
	public static boolean isPrime(int num) {
		if(num==0 || num==1) return false;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter lower range");
		int lower1 = scan.nextInt();
		System.out.println("enter Higher  range");
		int higher1 = scan.nextInt();
		int lowerPrime=0;
		int higherPrime =0;
		for (int j = lower1; j <=higher1; j++) {
			if (isPrime(j)) {
				//System.out.println(j);
				lowerPrime=j;
				System.out.println("lower prime is "+lowerPrime);
				break;
			}
		}
		System.out.println("Enter highr range");
		int higher2 = scan.nextInt();
		System.out.println("enter lower range");
		int lower2 = scan.nextInt();
		for (int k = higher2; k >= lower2; k--) {
			if (isPrime(k)) {
				higherPrime=k;
				System.out.println("higher prime is "+higherPrime);
				break;
			}
		}
		System.out.println("sum of higher lower is "+ (lowerPrime+higherPrime));
	}

}
