package numberSystem;
import java.util.Scanner;
public class DivisorOfNum {
	public static void divisor(int num) {
		for (int i = 1; i <=num; i++) {
			if (num%i==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		System.out.println("enter num");
		int n = sacn.nextInt();
		divisor(n);

	}

}
