package numberSystem;
import java.util.Scanner;
public class LargestPrimeInRange {
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
		// TODO Auto-generated method stub
		Scanner sacn = new Scanner(System.in);
		System.out.println("enter higher");
		int higher = sacn.nextInt();
		System.out.println("enter lower");
		int lower = sacn.nextInt();
		for (int i =higher ; i >=lower; i--) {
			if(prime(i)) {
				System.out.println(i);
				break;
			}
		}

	}

}
