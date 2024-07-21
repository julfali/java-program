package stringAssignment;

public class PrimeIndexChar {
	public static boolean isPrime(int num) {
		if (num==0 || num==1) return false;
		int count =0;
			
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		if (count==2) {
			return true;
		}return false;
	}

	public static void main(String[] args) {
		String str = "java program";
		for (int i = 0; i < str.length(); i++) {
			if (isPrime(i)) {
				System.out.println(str.charAt(i));
			}	
		}
		

	}

}
