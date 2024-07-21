package numberSystemPractice;

import java.util.Iterator;
import java.util.Scanner;

import numberSystem.PerfectNumber;
public class PracticeOfNumberSystem {
//	public static boolean prfect(int num) {
//		int sum =0;
//		int num2 = num;
//		for (int i = 1; i < num; i++) {
//			if (num%i==0) {
//				sum = sum+i;
//			}
//		}
//		if (sum==num) {
//			return true;
//		}return false;
//	}
	
	//Strong number
//	public static int factorial(int num) {
//		int fact = 1;
//		for (int i = 1; i <= num; i++) {
//			fact = fact*i;
//		}
//		return fact;
//	}
//	public static boolean isStrongNum(int num) {
//		int temp =num;
//		int sum = 0;
//		while (num != 0) {
//			int lastDigit = num%10;
//			sum = sum+factorial(lastDigit);
//			num = num/10;
//		}
//		while (sum == temp) {
//			return true;
//		}return false;
//	}
	
	//Armstrong number 
//	public static int power(int base, int exp) {
//		int power = 1;
//		for (int i = 1; i <= exp; i++) {
//			power= power*base;
//		}
//		return power;
//	}
//	public static boolean isArmStrong(int num) {
//		int count =0;
//		int num1 = num;
//		while (num != 0) {
//			num = num/10;
//			count++;
//		}
//		int exp = count;
//		int num2 = num1;
//		int  sum = 0;
//		while (num1 != 0) {
//			int lastDigit = num1%10;
//			sum = sum+power(lastDigit, exp);
//			num1 = num1/10;
//		}
//		if (num2 == sum) {
//			return true;
//		}return false;
//	}
	
	
	
	//Xylem number
//	public static boolean IsXylemNum(int num ) {
//		int num2 = num;
//		int extsum = 0;
//		int minSum = 0;
//		while (num != 0) {
//			int lastDigit = num%10;
//			if (num == num2 || num<10) {
//				extsum +=lastDigit; 
//			}else {
//				minSum +=lastDigit;
//			}
//			num/=10;
//		}
//		if(extsum==minSum) {
//			return true;
//		}return false;
//	}
	
	
	//GCD of a number
//	public static  int gcdOfNum(int num1, int num2) {
//		
//		int res = (num1<num2)? num1:num2;
//		int gcd = 0;
//		for (int i = 1; i <= res; i++) {
//			if (num1%i==0 && num2%i==0) {
//				gcd = i;
//			}
//		}
//		return gcd;
//	}
	
	
	//prime number, greatest prime number, lowest prime number
//	public static boolean isPrime(int num) {
//		if (num == 0 || num==1) return false;
//		int count = 0;
//		for (int i = 1; i <= num; i++) {
//			if(num%i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			return true;
//		}return false;
//	}
	
	//harshad number
	public static boolean isHarshad(int num) {
		int sum = 0;
		int temp = num;
		int sum2 = 0;
		while (num != 0) {
			int lastDigit = num%10;
			sum2 = sum2+lastDigit;
			num= num/10;
		}
		if (temp%sum2==0) {
			return true;
		}return false;
	}
	
	
	
	
	
	
    
	public static void main(String[] args) {
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num1");
//		int num1 = scan.nextInt();
//		if (isHarshad(num1)) {
//			System.out.println("number is harshad");
//		}else {
//			System.out.println("number is not harshad");
//		}
		
		
		//HARSHAD NUMBER IN RANGE
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a lower");
//		int lower = scan.nextInt();
//		System.out.println("enter a higher");
//		int higher = scan.nextInt();
//		int lowest =0;
//		for (int i = lower; i <= higher; i++) {
//			if (isHarshad(i)) {
//				System.out.println(i);
//			}
//		}
		
		
		//prime num
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num1");
//		int num1 = scan.nextInt();1
//		if (isPrime(num1)) {
//			System.out.println("number is prime");
//		}else {
//			System.out.println("number is not prime");
//		}
		
		//prime in range
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a lower");
//		int lower = scan.nextInt();
//		System.out.println("enter a higher");
//		int higher = scan.nextInt();
//		int lowest =0;
//		for (int i = lower; i <= higher; i++) {
//			if (isPrime(i)) {
//				System.out.println(i);
//				lowest =i;
//				break;
//			}
//		}
//		System.out.println("enter a higher");
//		int higher2 = scan.nextInt();
//		System.out.println("enter a lower");
//		int lower2 = scan.nextInt();
//		int highest = 0;
//		for (int i = higher;i>= lower; i--){
//			if (isPrime(i)) {
//				System.out.println(i);
//				highest =i;
//				break;
//			}
//		}
//		System.out.println("summation is:" +(lowest+highest));
		
		
		//GCD
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num1");
//		int num1 = scan.nextInt();
//		System.out.println("enter a num1");
//		int num2 = scan.nextInt();
//		System.out.println(gcdOfNum(num1, num2));
		
		
		//febbonacci series
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int num = scan.nextInt();
//		int a = 0;
//		int b =1 ;
//		for (int i = 1; i <num; i++) {
//			System.out.print(a+" ");
//			int c =a+b;
//			a=b;
//			b=c;
//		}
		
		
		//XYlem number
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int num = scan.nextInt();
//		if (IsXylemNum(num)) {
//			System.out.println("XYlem");
//		}else {
//			System.out.println("not xylem");
//		}
		//decimal to binar
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int num = scan.nextInt();
//		int bin =0;
//		int rev =1;
//		while (num != 0) {
//			int lastDigit= num%2;
//			bin = bin+lastDigit*rev;
//			rev = rev*10;
//			num = num/2;
//		}
//		System.out.println("binary num is: "+ bin);
		
		
		//binary to decimal
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int num = scan.nextInt();
//		int dec =0;
//		int rev =1;
//		while (num != 0) {
//			int lastDigit= num%10;
//			dec = dec+lastDigit*rev;
//			rev = rev*2;
//			num = num/10;
//		}
//		System.out.println("decimal num is: "+ dec);
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int n = scan.nextInt();
//		if (isArmStrong(n)) {
//			System.out.println(n+" is a ArmStrong num");
//		}else {
//			System.out.println(n+" is not a ArmStrong num");
//		}
		
		
		//Strong number
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int n = scan.nextInt();
//		if (isStrongNum(n)) {
//			System.out.println(n+" is a Strong num");
//		}else {
//			System.out.println(n+" is not a Strong num");
//		}
		
		
		//factorial pf a num
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int n = scan.nextInt();
//		System.out.println(factorial(n));
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int n = scan.nextInt();	
//		if (prfect(n)) {
//			System.out.println(n+ "is perfect");
//		}else {
//			System.out.println(n+ "is not perfect");
//		}
		
		//NatualNumber in range
//		for (int i = 1; i <= 100; i++) {
//              System.out.println(i);			
//		}
		
		//Summation of Natual Number from 1-10
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int n = scan.nextInt();		
//		System.out.println(SumOfNatualNUmber(n));
		
		
		
		//Divisor of a given number
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int n = scan.nextInt();		
//		divisorOfNum(n);
		
		
		
		// count of divisor
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int n = scan.nextInt();	
//		System.out.println(countOfDivisor(n));
		
		
		
		//Prime Number
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int n = scan.nextInt();	
//		if (primeNumber(n)) {
//			System.out.println("nuber is prime");
//		}else {
//			System.out.println("number is not prime");
//		}
		
		
		
        //Prime NUmber in range
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter lower range");
//		int lower = scan.nextInt();	
//		System.out.println("enter higher range");
//		int higher = scan.nextInt();
//		for (int i = lower; i <= higher; i++) {
//			if (primeNumber(i)) {
//				System.out.println(i);
//			}
//		}
		// Smallest prime number in range
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter lower range");
//		int lower = scan.nextInt();	
//		System.out.println("enter higher range");
//		int higher = scan.nextInt();
//		for (int i = lower; i <= higher; i++) {
//			if (primeNumber(i)) {
//				System.out.println(i);
//				break;
//			}
//		}
		// largest prime number in given range
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter higher range");
//		int higher = scan.nextInt();
//		System.out.println("enter lower range");
//		int lower = scan.nextInt();	
//		for (int i = higher; i >= lower; i--) {
//			if (primeNumber(i)) {
//				System.out.println(i);
//				break;
//			}
//		}
		
		//Summation of of smallest and largest prime number
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter lower range");
//		int lower = scan.nextInt();	
//		System.out.println("enter higher range");
//		int higher = scan.nextInt();
//		int smallest = 0;
//		for (int i = lower; i <= higher; i++) {
//			if (primeNumber(i)) {
//				smallest = i;
//				break;
//			}
//		}
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("enter higher range");
//		int higher2 = scan2.nextInt();
//		System.out.println("enter lower range");
//		int lower2 = scan2.nextInt();	
//		int largest = 0;
//		for (int i = higher2; i >= lower2; i--) {
//			if (primeNumber(i)) {
//				largest = i;
//				break;
//			}
//		}
//		
//		System.out.println("Summation is: "+ (smallest+largest));
		
		//summation of Divisor
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("enter num");
//		int n = scan2.nextInt();
//		System.out.println(sumOfDivisor(n));
		
		
		//perfect number
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("enter num");
//		int n = scan2.nextInt();
//		if (perfectNumber(n)) {
//			System.out.println("number is perfect");
//		}else {
//			System.out.println("number is not perfect");
//		}
		
		//perfect num in range 
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter lower range");
//		int lower = scan.nextInt();	
//		System.out.println("enter higher range");
//		int higher = scan.nextInt();
//		int smallest = 0;
//		for (int i = lower; i <= higher; i++) {
//			if (perfectNumber(i)) {
//				System.out.println(i);
//			}
//		}
		
		
		
		//Factorial of a given number
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("enter num");
//		int n = scan2.nextInt();
//		System.out.println(factorialOfNum(n));
		
		
		//StrongNumber 
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("enter num");
//		int n = scan2.nextInt();
//		if (strongNumber(n)) {
//			System.out.println("number is strong");
//		}else {
//			System.out.println("number is not Strong ");
//		}
		
		//Strong number in range
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter lower range");
//		int lower = scan.nextInt();	
//		System.out.println("enter higher range");
//		int higher = scan.nextInt();
//		int smallest = 0;
//		for (int i = lower; i <= higher; i++) {
//			if (strongNumber(i)) {
//				System.out.println(i);
//			}
//		}
		
		//fabbonaci series 
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("enter num");
//		int num = scan2.nextInt();
//		int a = 0;
//		int b = 1;
//		for (int i = 1; i <= num; i++) {
//			System.out.println(a+" ");
//			int c = a+b;
//			a=b;
//			b=c;
//			
//		}
		
		//Spy number
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int num =  scan.nextInt();
//		if (spyNumber(num)) {
//			System.out.println("spy number");
//		}else {
//			System.out.println("not spy number");
//		}
		
		
		//Power of number
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a base");
//		int base =  scan.nextInt();
//		System.out.println("enter a exp");
//		int exp =  scan.nextInt();
//		System.out.println(powerOfNum(base, exp));
		
		
		
		//Armstrong number
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a num");
//		int num =  scan.nextInt();
//		if (armStrongNumber(num)) {
//			System.out.println("armstrong number");
//		}else {
//			System.out.println("not Armstromng");
//		}
		
		// convert a given number from Decimal to binary
//	    Scanner scan = new Scanner(System.in);
//	    System.out.println("enter a number");
//	    int num = scan.nextInt();
//	    int bin = 0 ;
//	    int rev = 1;
//	    while (num != 0) {
//			int lastDigit = num%2;
//			bin = bin+lastDigit*rev;
//			rev = rev*10;
//			num = num/2;
//		}
//	    System.out.println("binry is: "+bin);
		
		
	    
	    //convert a given number from binary to decimal
//	    Scanner scan = new Scanner(System.in);
//	    System.out.println("enter a number");
//	    int num = scan.nextInt();
//	    int dec = 0;
//	    int rev = 1;
//	    while (num != 0) {
//			int lastDigit = num%10;
//			dec = dec+lastDigit*rev;
//			rev = rev*2;
//			num = num/10;
//		}
//	    System.out.println("decimal is: "+dec);
		
		
		
		//Xylem Number 
//		Scanner scan = new Scanner(System.in);
//	    System.out.println("enter a number");
//	    int num = scan.nextInt();
//	    if (xylemNum(num)) {
//			System.out.println("number is xylem");
//		}else {
//			System.out.println("number is not xylem");
//		}
		
		
		
		//GCD of a number
//		Scanner scan = new Scanner(System.in);
//	    System.out.println("enter a number1");
//	    int num1 = scan.nextInt();
//	    System.out.println("enter a number2");
//	    int num2 = scan.nextInt();
//	    System.out.println(GCD(num1, num2));
//			
//	}
//	
//	public static int GCD(int num1 , int num2) {
//		int gcd = 0;
//		int res = (num1<num2)? num1:num2;
//		for (int i = 1; i <=res; i++) {
//			if (num1%i==0 || num2%i==0) {
//				gcd = i;
////				System.out.println(i);
//			}
//		}
//		return gcd;
//	}
	
	//XylemNumber
//	public static boolean xylemNum(int num) {
//		int num1 = num;
//		int extSum = 0;
//		int meanSum =0;
//		while(num != 0) {
//			int lastDigit = num%10;
//			if (num==num1 || num<10) {
//				extSum = extSum+lastDigit;
//			}else {
//				meanSum = meanSum+lastDigit;
//			}
//			num = num/10;
//		}
//		if (extSum==meanSum) {
//			return true;
//		}return false;
//	}
	

	
	//ArmStrong number
//	public static boolean armStrongNumber(int num1) {
//		int num2 = num1;
//		int count =0;
//		while (num1 !=0) {
//			num1 = num1/10;
//			count++;	
//		}
//		int exp = count;
//		int num3 = num2;
//		int sum = 0;
//		while (num2 != 0) {
//			int base = num2%10;
//			sum = sum+powerOfNum(base,exp);
//			num2 = num2/10;	
//		}
//		if (sum==num3) {
//			return true;
//		}return false;
//	}
	
	//power of number
//	public static int powerOfNum(int base, int exp) {
//		int power = 1;
//		for (int i = 1; i <= exp; i++) {
//			power = power*base;
//		}
//		return power;
//	}
	
	
	//Spy number
//	public static boolean spyNumber(int num) {
//		int temp = num;
//		int sum =0;
//		int product = 1;
//		while (num != 0) {
//			int lastDigt = num%10;
//			sum+=lastDigt;
//			product*=lastDigt;
//			num=num/10;
//		}
//		if (sum==product) {
//			return true;
//		}return false;
//	}
	
	
	
	//Factorial of a given number
//	public static int factorialOfNum(int num) {
//		int fact =1;
//	    for (int i = 1; i <=num; i++) {
//			fact *= i;
//		}
//	    return fact;
//	}
	
	
	
	// check given number is Strong number or not
//	public static boolean strongNumber(int num) {
//		int temp = num;
//		int sum = 0;
//		while (num!=0) {
//			int lastDigit = num%10;
//			sum = sum+factorialOfNum(lastDigit);
//			num = num/10;
//		}
//		if (sum==temp) {
//			return true;
//		}return false;
//	}
	
	
	
	
	//Perfect number 
//	public static boolean perfectNumber(int num) {
//		int sum = 0;
//		for (int i = 1; i < num; i++) {
//			if (num%i == 0) {
//				sum = sum+i;
//			}
//		}
//		if (sum==num) {
//			return true;
//		}return false;
//	}
	
	
	//ummation of Divisor
//	public static int sumOfDivisor(int num) {
//		int sum = 0;
//		for (int i = 1; i <= num; i++) {
//			if (num%i == 0) {
//				sum = sum+i;
//			}
//		}
//		return sum;
//	}
	
	
	//Summation of Natual Number from 1-10
//	public static int SumOfNatualNUmber(int num) {
//		int sum =0;
//		for (int i = 1; i <= num; i++) {
//			sum+=i;
//          //System.out.println(i);			
//	    }
//		return sum;
// } 
	
	
	
	
	//Divisor of a given number
//	public static void divisorOfNum(int num) {
//		for (int i = 1; i <=num; i++) {
//			if (num%i==0) {
//				System.out.println(i);
//			}
//			
//		}
//	}
	
	
	//Count the divisor of a number
//	public static int countOfDivisor(int num) {
//		int count = 0;
//		for (int i = 1; i <=num; i++) {
//			if (num%i==0) {
//				count++;
//			}
//			
//		}
//		return count;
//	}
	
	
	//Prime Number
	
//	public static boolean primeNumber(int num) {
//		if (num == 1 || num==0) return false;
//		int count = 0;
//		for (int i = 1; i <=num; i++) {
//			if (num%i==0) {
//				count++;
//			}
//			
//		}
//		if (count == 2) {
//			return true;
//		} return false;
//	}
	}	

}
