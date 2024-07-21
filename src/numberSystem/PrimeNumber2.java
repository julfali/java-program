package numberSystem;
import java.util.Scanner;
public class PrimeNumber2 {
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
		Scanner sacn = new Scanner(System.in);
		System.out.println("enter num");
		int n = sacn.nextInt();
		
		if (prime(n)) {
			System.out.println("prime number");
		}else {
			System.out.println("not a prime number");
		}
		
	}

}
