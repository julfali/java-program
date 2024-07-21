package numberSystem;
import java.util.Scanner;
public class GCDofNumber {

	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		System.out.println("enter num1");
		int num1 = sacn.nextInt();
		System.out.println("enter num2");
		int num2 = sacn.nextInt();
		int gcd = 0;
		int res = (num1<num2)?num1:num2;
		for (int i = 1; i <=res; i++) {
			if (num1%i==0 && num2%i==0) {
				System.out.println(i);
				gcd = i;
				
			}
		}
		System.out.println("gretest common divisor "+gcd);
	}

}
