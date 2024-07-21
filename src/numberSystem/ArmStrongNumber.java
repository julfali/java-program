package numberSystem;
import java.util.Scanner;
public class ArmStrongNumber {
	public static int power(int base, int exp) {
		int power =1;
		//int count = 0;
		for (int i = 1; i <=exp; i++) {
			power = power*base;
		}
		return power;
	}
	public static boolean isArmStrong(int num) {
		int num2 = num;
		int count = 0;
		while(num!=0) {
			num = num/10;
			count++;
		}
		int exp = count;
		int num3 = num2;
		int sum =0;
		while(num2!=0) {
			int base = num2%10;
			sum = sum+power(base, exp);
			num2 = num2/10;
		}
		if(sum==num3) {
			return true;
		}return false;
		
	}

	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
//		System.out.println("enter num");
//		int num = sacn.nextInt();
//		if (isArmStrong(num)) {
//			System.out.println("num is armstrong");
//		}else {
//			System.out.println("num is not armstrong");
//		}
		
		//ArmStrong number in Range
		System.out.println("enter lower Range");
		int lower = sacn.nextInt();
		System.out.println("enter higher Range");
		int higher = sacn.nextInt();
		for (int i = lower; i <=higher; i++) {
			if (isArmStrong(i)) {
				System.out.println(i);
			}
		}

	}

}
