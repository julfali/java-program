package numberSystem;
import java.util.Scanner;
public class FactorialOfANum {
	public static int factorial(int num) {
		int fact =1;
		for(; num>0; num--) {
			fact = fact*num;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		System.out.println("enter num");
		int n = sacn.nextInt();
		System.out.println(factorial(n));
		

	}

}
