package numberSystem;
import java.util.Scanner;
public class FindPrimeInRange {
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
		System.out.println("enter lower");
		int lower = sacn.nextInt();
		System.out.println("enter lower");
		int higher = sacn.nextInt();
		for (int i = lower; i <=higher; i++) {
			if(prime(i)) {
				System.out.println(i);
			}
		}

	}

}
