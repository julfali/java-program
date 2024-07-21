package numberSystem;

import java.util.Scanner;

public class StrongNumber {
	//Krishnamurthy number is another special number in Java. A number is said to be Krishnamurthy if 
	//the factorial sum of all its digits is equal to that number. Krishnamurthy number is also referred to as a Strong number.
	
	//ex:-145
	public static int factorial(int num) {
		int fact =1;
		for(; num>0; num--) {
			fact = fact*num;
		}
		return fact;
	}
	public static boolean StrongNum(int num) {
		int sum =0;
		int temp = num;
		while (num!=0) {
			int lastDigit = num%10;
			sum = sum+factorial(lastDigit);
			num = num/10;
		}
		if(sum==temp) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		System.out.println("enter num");
		int n = sacn.nextInt();
		
		if (StrongNum(n)) {
			System.out.println("Number is Strong");
		}else {
			System.out.println("Nnumber is not Strong");
		}

	}

}
