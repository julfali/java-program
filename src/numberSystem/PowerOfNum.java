package numberSystem;
import java.util.Scanner;
public class PowerOfNum {
	public static int power(int base, int exp) {
		int power =1;
		for (int i = 1; i <=exp; i++) {
			power = power*base;
		}
		return power;
	}

	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		System.out.println("enter base");
		int base = sacn.nextInt();
		System.out.println("enter exp");
		int exp = sacn.nextInt();
		System.out.println(power(base,exp));

	}

}
