package array;
import java.util.Scanner;
public class PrimeElement {
	public static boolean isPrime(int num) {
		if(num==0 || num==1) return false;
		int count =0;
		for (int i = 1; i <= num; i++) {
			if (num%i ==0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}return false;
	}

	public static void main(String[] args) {
		int [] arr = {4,5,6,7,8,10,12,11,9,13,17};
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
			    System.out.println(arr[i]);
			}
		}

	}

}
