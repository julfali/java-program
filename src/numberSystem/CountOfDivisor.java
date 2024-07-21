package numberSystem;
import java.util.Scanner;
public class CountOfDivisor {
	public static int count(int num) {
		int count =0;
		for (int i = 1; i <=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		System.out.println("enter num");
		int n = sacn.nextInt();
		System.out.println(count(n));

	}

}
