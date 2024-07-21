package numberSystem;
import java.util.Scanner;
public class FibnocciSeries {

	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		System.out.println("enter num");
		int num = sacn.nextInt();
		int a =0;
		int b= 1;
		for(int i=1; i<=num; i++) {
			System.out.print(a+" ");
			int c = a+b;
			a=b;
			b=c;
		}
		

	}

}
