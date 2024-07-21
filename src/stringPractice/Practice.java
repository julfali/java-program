package stringPractice;
import java.util.Iterator;
import java.util.Scanner;

import strings.FrequencyOfChar;
public class Practice {
	//PRINT THE CHARACTER OF GIVEN STRING
//	public static void printChar(String str) {
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			System.out.println(ch);
//		}
//	}
	
	
	
	//PRINT THE EVEN CHARACTER OF A GIVEN STRING
//	public static void printEvenChar(String str) {
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (i%2==0) {
//				System.out.println(ch);
//			}
			//ODD CHARACTER
//			if (i%2 != 0) {
//				System.out.println(ch);
//			}
//		}
//	}
	
	//PRIME INDEX CHARACTER
//	public static boolean isPrime(int num) {
//		if (num == 1 || num==0) return false; 
//		int count =0;
//		for (int i = 1; i <= num; i++) {
//			if (num%i ==0) {
//				count ++;
//			}
//		}
//		if (count == 2) {
//			return true;
//		}return false;
//		
//	}
	
	//PRINT THE VOWEL FROM A GIVEN STRING 
//	public static void vowel(String str) {
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			switch(ch) {
//			case 'A':
//			case 'E':
//			case 'I':
//			case 'O':
//			case 'U':
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u': System.out.println(ch);
//			}
//			
//		}
//	}
	//PRINT NUMBER OF VOWEL IN A STRING
//	public static void vowelCount(String str) {
//		int count =0;
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			switch(ch) {
//			case 'A':
//			case 'E':
//			case 'I':
//			case 'O':
//			case 'U':
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u': count++;
//			}
//			
//		}
//		System.out.println(count);
//	}
	
	
	//CONVERT THE GIVEN STRING INTO UPPER CASE
//	public static String UpperCase(String str) {
//		String result = "";
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (ch>=97 && ch<=122) {
//				ch-=32;
//				result = result+ch;
//			}else {
//				result = result+ch;
//			}
//		}
//		return result;
//	}
	
	//CONVERT THE GIVEN STRING INTO UPPER CASE
//	public static String LowerCase(String str) {
//		String result = "";
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (ch>=65 && ch<=90) {
//				ch+=32;
//				result = result+ch;
//			}else {
//				result = result+ch;
//			}
//		}
//		return result;
//	}
	
	//TO CHECK A PARTICULAR CHAR IS PRESENT OR NOT
//	public static boolean contain(String str , char ch) {
//		for (int i = 0; i < str.length(); i++) {
//			char ch2 = str.charAt(i);
//			if (ch==ch2) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	//TO CHECK THE FREQUENCY OF CHARACTER IN A STRING
//	public static void frequenyOfChar(String str) {
//		for (int i = 0; i < str.length(); i++) {
//			int count =0;
//			char ch1 = str.charAt(i);
//			for (int j = 0; j < str.length(); j++) {
//				char ch2 = str.charAt(j);
//				if (ch1 == ch2) {
//					count++;
//				}
//			}
//			System.out.println(ch1+" frequency is "+ count);
//		}
//	}
	
	
	
	//Check the frequency of given string by removing duplicate
//	public static void frequencyOfChar(String str) {
//		String res = remDup(str);
//		for (int i = 0; i < res.length(); i++) {
//			char ch1 = res.charAt(i);
//			int count = 0;
//			for (int j = 0; j < str.length(); j++) {
//				char ch2 = str.charAt(j);
//				if (ch1 == ch2) {
//					count++;
//				}
//			}
//			System.out.println(ch1+" frequency is "+count);
//		}
//	}
	
	//Check min ocuurence of character in agiven String
//	public static void minOccOf(String str) {
//		int minCount = str.length();
//		char minChar = ' ';
//		String res = remDup(str);
//		for (int i = 0; i < res.length(); i++) {
//			char ch1 = res.charAt(i);
//			int count = 0;
//			for (int j = 0; j < str.length(); j++) {
//				char ch2 = str.charAt(j);
//				if (ch1 == ch2) {
//					count++;
//				}
//			}
//			if (count < minCount) {
//				minCount=count;
//				minChar = ch1;
//			}
//		}
//		System.out.println(minChar+" has min occ "+minCount);
//	}
	
	
	
	//Check max ocuurence of character in a given String
//	public static void maxOccOfChar(String str) {
//		int maxCount = 0;
//		char maxChar = ' ';
//		String res = remDup(str);
//		for (int i = 0; i < res.length(); i++) {
//			char ch1 = res.charAt(i);
//			int count = 0;
//			for (int j = 0; j < str.length(); j++) {
//				char ch2 = str.charAt(j);
//				if (ch1 == ch2) {
//					count++;
//				}
//			}
//			if (count > maxCount) {
//				maxCount=count;
//				maxChar = ch1;
//			}
//		}
//		System.out.println(maxChar+" has max occ "+maxCount);
//	}
    
	
	public static char maxOccOfChar(String str) {
		int maxCount = 0;
		char maxChar = ' ';
		String res = remDup(str);
		for (int i = 0; i < res.length(); i++) {
			char ch1 = res.charAt(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				char ch2 = str.charAt(j);
				if (ch1 == ch2) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount=count;
				maxChar = ch1;
			}
		}
		return maxChar;
	}
	
	public static char minOccOf(String str) {
		int minCount = str.length();
		char minChar = ' ';
		String res = remDup(str);
		for (int i = 0; i < res.length(); i++) {
			char ch1 = res.charAt(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				char ch2 = str.charAt(j);
				if (ch1 == ch2) {
					count++;
				}
			}
			if (count < minCount) {
				minCount=count;
				minChar = ch1;
			}
		}
		return minChar;
	}
	//REPLACE A CHARACTER WITH GIVEN CHARACTER IN A GIVEN STRING
//	public static String replace(String str ,char ch , char chTobeRep) {
//		String res = "";
//		for (int i = 0; i < str.length(); i++) {
//			char ch2 = str.charAt(i);
//			if (ch==ch2) {
//				res = res+chTobeRep;
//			}else {
//				res = res+ch2;
//			}
//		}
//		return res;
//	}
	
	
	//REPLACE MIN OCCURENCE WITH MAX OCCURENCE
	public static String replaceMinWithMax(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == minOccOf(str)) {
				res = res+maxOccOfChar(str);
			}else {
				res = res+ch;
			}
		}
		return res;
	}
	
	//pallindome or not
	public static String reverse(String str) {
		String res = "";
		for (int i = str.length()-1; i >=0; i--) {
			char ch = str.charAt(i);
			res = res+ch;
		}
		return res;
	}
	//pallindome or not in another way
	public static boolean pallindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		while (start<end) {
			char ch1 = str.charAt(start);
			char ch2 = str.charAt(end);
			if (ch1 != ch2) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	//sum of digit in a given string
	public static int sumOfDigit(String str) {
		int sum =0 ;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch>=48 && ch<= 57) {
				ch-=48;
				sum = sum+ch;
			}
		}
		return sum;
	}
	
	
	//TO REMOVE DUPLICATE FROM A GIVEN STRING
		public static String remDup(String str) {
			String res = "";
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (!(res.contains(ch+""))) {
					res=res+ch;
				}
			}
			return res;
		}
		//to print duplicate from a srting
		public static String remDup2(String str) {
			String res = "";
			String res2 ="";
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (!(res.contains(ch+""))) {
					res=res+ch;
				}else {
					res2=res2+ch;
				}
			}
			return remDup(res2);
		}
		
//		public static boolean  compareTostr(String str1, String str2) {
//			for (int i = 0; i < str1.length(); i++) {
//				char ch1 = str1.charAt(i);
//				for (int j = 0; j < i; j++) {
//					char ch2 = str2.charAt(j);
//					if (ch1==ch2) {
//						return true;
//					}
//				}
//				
//			}
//			return false;
//		}
		
		//to remove a character given by user
		public static String remove(String str ,char ch) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch2 = str.charAt(i);
			if (ch==ch2) {
				res = str.replaceAll(ch+"", "");					
			}
		}
		return res;
	}
		
		
		
		public static char firstNonReapChar(String str) {
			int mincount = str.length();
			char minChar = ' ';
			String res = remDup(str);
			for (int i = 0; i < res.length(); i++) {
				char ch1 = res.charAt(i);
				int count =0;
				for (int j = 0; j < str.length(); j++) {
					char ch2 =str.charAt(j);
					if (ch1==ch2) {
						count++;
					}
				}
				if (count<mincount) {
					if (count==1) {
						minChar=ch1;
						break;
					}
				}
			}
			return minChar;
		}
		//CHARACTER OF STRING
//		public static void character() {
//			String str ="abcde";
//			for (int i = 0; i < str.length(); i++) {
//				System.out.print(str.charAt(i)+" ");
//			}
//		}
		//ODD INDEX CHARACTER
//		public static void oddIndexChar() {
//			String str = "alagdnd";
//			for (int i = 0; i < str.length(); i++) {
//				if (i%2 != 0) {
//					System.out.print(str.charAt(i)+" ");
//				}
//			}
//		}
		//PRIME INDEX CHARACTER
//		public static boolean isPrime(int num) {
//			if (num == 1 || num==0) return false; 
//			int count =0;
//			for (int i = 1; i <= num; i++) {
//				if (num%i ==0) {
//					count ++;
//				}
//			}
//			if (count == 2) {
//				return true;
//			}return false;
//			
//		}
//		public static void primeIndex() {
//			String str = "abcdefgh";
//			for (int i = 0; i < str.length(); i++) {
//				if (isPrime(i)) {
//					System.out.print(str.charAt(i)+" ");
//				}
//			}
//		}
		//VOWEL FROM A GIVEN STRING
//		public static void vowelFromStr() {
//			String str = "programming";
//			for (int i = 0; i < str.length(); i++) {
//				char ch = str.charAt(i);
//				switch(ch) {
//				case 'A':
//				case 'E':
//				case 'I':
//				case 'O':
//				case 'U':
//				case 'a':
//				case 'e':
//				case 'i':
//				case 'o':
//				case 'u':System.out.print(ch+" ");	
//				}
//			}
//		}
		//NUMBER OF VOWEL
//		public static void numberOfVowel() {
//			String str = "programming";
//			int count =0;
//			for (int i = 0; i < str.length(); i++) {
//				char ch = str.charAt(i);
//				switch(ch) {
//				case 'A':
//				case 'E':
//				case 'I':
//				case 'O':
//				case 'U':
//				case 'a':
//				case 'e':
//				case 'i':
//				case 'o':
//				case 'u':count++;	
//				}
//			}
//			System.out.println("numbr of vowel is "+ count);
//		}
		
		//COVERTING GIVEN STRING TO UPPER CASE
//		public static String toUpperCase(String str) {
//			String res = "";
//			for (int i = 0; i < str.length(); i++) {
//				char ch = str.charAt(i);
//				if (ch>= 97 && ch<=122) {
//				    ch-=32;
//				    res+=ch;
//				}else {
//					res+=ch;
//				}
//			}
//			return res;
//		}
		//COVERTING GIVEN STRING TO LOWER CASE
		public static String toLowerCase(String str) {
			String res = "";
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch>= 65 && ch<=90) {
				    ch+=32;
				    res+=ch;
				}else {
					res+=ch;
				}
			}
			return res;
		}
		//CHECK A GIVEN CHARACTER IS PRESENT OR NOT IN A GIVEN STRING
		public static boolean isChar(String str, char ch) {
			for (int i = 0; i < str.length(); i++) {
				char ch2 = str.charAt(i);
				if (ch==ch2) {
					return true;
				}
				
			}
			return false;
		}
		//REMOVE DUPLICATE FROM A GIVEN STRING
		public static String removeDuplicate(String str) {
			String res = "";
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (!(res.contains(ch+""))) {
					res+=ch;
				}
			}
			return res;
		}
		//FREQUENCY OF CHARACTER
		public static void frequencyOfChar(String str) {
			String res = removeDuplicate(str);
			for (int i = 0; i < res.length(); i++) {
				char ch1 = res.charAt(i);
				int count =0;
				for (int j = 0; j < str.length(); j++) {
					char ch2 =str.charAt(j);
					if (ch1==ch2) {
						count++;
					}
				}
				System.out.println(ch1+" frequency is "+count);
			}
			
		}
		//MIN OCCURENCE OF A CHARACTER IN A GIVEN STRING
//		public static void minimumOccurenace(String str) {
//			int minCount = str.length();
//			char minchar = ' ';
//			String res = removeDuplicate(str);
//			for (int i = 0; i < res.length(); i++) {
//				char ch1 = res.charAt(i);
//				int count = 0;
//				for (int j = 0; j < str.length(); j++) {
//					char ch2 = str.charAt(i);
//					if (ch1==ch2) {
//						count++;
//					}
//				}
//				if (count < minCount) {
//					minCount = count;
//					minchar = ch1;
//				}
//			}
//			System.out.println(minchar+" has min count "+ minCount);
//		}
		//REPLACE STRING CHARACTER WITH GIVEN CHARACTE
//		public static String replaceCharacter(String str, char ch, char repChar) {
//			String res = "";
//			for (int i = 0; i < str.length(); i++) {
//				 char ch2 = str.charAt(i);
//				 if (ch==ch2) {
//					res+=repChar;
//				}else {
//					res+=ch2;
//				}
//			}
//			return res;
//		}
		//MIN OCCURENCE OF A CHARACTER IN A GIVEN STRING
//				public static void minimumOccurenace(String str) {
//					int minCount = str.length();
//					char minchar = ' ';
//					String res = removeDuplicate(str);
//					for (int i = 0; i < res.length(); i++) {
//						char ch1 = res.charAt(i);
//						int count = 0;
//						for (int j = 0; j < str.length(); j++) {
//							char ch2 = str.charAt(j);
//							if (ch1==ch2) {
//								count++;
//							}
//						}
//						if (count < minCount) {
//							minCount = count;
//							minchar = ch1;
//						}
//					}
//					System.out.println(minchar+" has min count "+ minCount);
//				}
		//MAX OCCURENCE OF A CHARACTER IN A GIVEN STRING
//		public static void maximumOccurence(String str) {
//			int maxCount = 0;
//			char maxChar = ' ';
//			String res = removeDuplicate(str);
//			for (int i = 0; i < res.length(); i++) {
//				char ch = res.charAt(i);
//				int count =0;
//				for (int j = 0; j < str.length(); j++) {
//					char ch2 = str.charAt(j);
//					if (ch==ch2) {
//						count++;
//					}
//				}
//				if (count>maxCount) {
//					maxCount = count;
//					maxChar = ch;
//				}
//			}
//			System.out.println(maxChar+" has maximum occurence "+ maxCount);
//		}
		//replace min occurence with max occurence
		public static char minimumOccurenace(String str) {
			int minCount = str.length();
			char minchar = ' ';
			String res = removeDuplicate(str);
			for (int i = 0; i < res.length(); i++) {
				char ch1 = res.charAt(i);
				int count = 0;
				for (int j = 0; j < str.length(); j++) {
					char ch2 = str.charAt(j);
					if (ch1==ch2) {
						count++;
					}
				}
				if (count < minCount) {
					minCount = count;
					minchar = ch1;
				}
			}
			return minchar;
		}
		
		public static char maximumOccurence(String str) {
			int maxCount = 0;
			char maxChar = ' ';
			String res = removeDuplicate(str);
			for (int i = 0; i < res.length(); i++) {
				char ch = res.charAt(i);
				int count =0;
				for (int j = 0; j < str.length(); j++) {
					char ch2 = str.charAt(j);
					if (ch==ch2) {
						count++;
					}
				}
				if (count>maxCount) {
					maxCount = count;
					maxChar = ch;
				}
			}
			return maxChar;
		}
		public static String replaceWidMax(String str) {
			String res = "";
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch==minimumOccurenace(str)) {
					res+=maxOccOfChar(str);
				}else {
					res+=ch;
				}
			}
			return res;
		}
		//pallidrome without doing reverrse
		public static boolean pallindromeCheck(String str) {
			String res = "";
			int start =0;
			int endIndex = str.length()-1;
			while (start<endIndex) {
				char stChar = str.charAt(start);
				char endChar = str.charAt(endIndex);
				if (stChar != endChar) {
					return false;
				}
				start++;
				endIndex--;
			}
			return true;
		}
		//SUM OF  NUMBER IN GIVEN STRING
		public static int summationOfNumInstr(String str) {
			int sum =0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch>=48 && ch<=57) {
					ch-=48;
					sum+=ch;
				}
			}
			return sum;
		}
		//LEFT ROTATION BASED ON USER INPUT
//		public static String leftRotation(String str, int userInput) {
//			String res = "";
//			for (int i = userInput; i < str.length(); i++) {
//				 char ch = str.charAt(i);
//				 res+=ch;
//			}
//			for (int i = 0; i < userInput; i++) {
//				char ch =str.charAt(i);
//				res+=ch;
//			}
//			return res;
//		}
		
		//RIGHT ROTATION BASED ON USER INPUT
		public static String rightRotation(String str, int userInput) {
			String res = "";
			for (int i = str.length()-userInput; i < str.length(); i++) {
				 char ch = str.charAt(i);
				 res+=ch;
			}
			for (int i = 0; i < str.length()-userInput; i++) {
				char ch =str.charAt(i);
				res+=ch;
			}
			return res;
		}
		
		//program to print all possible substring of a given String
		public static void subString(String str) {
			for (int i = 0; i < str.length(); i++) {
				 for (int j = i; j < str.length(); j++) {
					  for (int k = i; k <=j; k++) {
						System.out.print(str.charAt(k));
					}
					System.out.println();  
				}
			}
		}
		//PROGRAM TO REVERRSE WORDS IN A STRING
		public static String reverseWord(String str) {
			String res = "";
			for (int i = str.length()-1; i >=0; i--) {
				res+=str.charAt(i);
			}
			return res;
		}
		
		
		
	public static void main(String[] args) {
		//PROGRAM TO REVERRSE WORDS IN A STRING
		String str = "this is collection of String";
		String res = "";
		System.out.println(str);
		String [] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			if (i==strArr.length) {
				res+=reverseWord(strArr[i]);
			}else {
				res+=reverseWord(strArr[i]+" ");
			}
		}
		System.out.println(res.trim());
		//program to print all possible substring of a given String
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		subString(str1);
		
		
		//RIGHT ROTATION BASED ON USER INPUT
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println("Enter a number");
//		int userInput = scan.nextInt();
//		System.out.println(rightRotation(str1, userInput));
		
		
		//LEFT ROTATION BASED ON USEER INPUT
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println("Enter a number");
//		int userInput = scan.nextInt();
//		System.out.println(leftRotation(str1, userInput));
		
		
		//SUM OF  NUMBER IN GIVEN STRING
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println(summationOfNumInstr(str1));
		//pallindrome
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println(pallindromeCheck(str1));
		
		
		//replace min occurence with max occurence
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println(replaceWidMax(str1));
		
		
		//MAX OCCURENCE OF A CHARACTER IN A GIVEN STRING
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		maximumOccurence(str1);
		//MINIMUM OCUURENCE OF CHAR IN A GIVEN STRING
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		minimumOccurenace(str1);
		
		//REPLACE STRING CHARACTER WITH GIVEN CHARACTE
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println("enter charchter");
//		char ch = scan.next().charAt(0);
//		System.out.println("enter char to replace");
//		char repChar = scan.next().charAt(0);
//		System.out.println(replaceCharacter(str1, ch, repChar));

		//FREQUENCY OF CHARACTER
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		frequencyOfChar(str1);
		//REMOVE DUPLICATE FROM A GIVEN STRING
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println(removeDuplicate(str1));
		
		//CHECK A GIVEN CHARACTER IS PRESENT OR NOT IN A GIVEN STRING
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println("enter a string");
//		char ch = scan.next().charAt(0);
//
//		System.out.println(isChar(str1,ch));
		
		//COVERTING GIVEN STRING TO LOWER CASE
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println(toLowerCase(str1));
		
		
		
		
		//COVERTING GIVEN STRING TO UPPER CASE
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println(toUpperCase(str1));
		
		
		//NUMBER OF VOWEL
//		numberOfVowel();
		
		//VOWEL FROM A GIVEN STRING
//		vowelFromStr();
		
		
		
		
		//prime index character
//		primeIndex();
		
		//ODD INDEX CHARACTER
//		oddIndexChar();
		
		
		
		
		
		//CHARACTER OF STRING
//		character();
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println(firstNonReapChar(str1));
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println("enter a string");
//		char ch = scan.next().charAt(0);
//		System.out.println(remove(str1, ch));
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println("enter a string");
//		String str2 = scan.next();
//		System.out.println(compareTostr(str1, str2));
		
		//sum of digit in a given string
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str = scan.next();
//		System.out.println(sumOfDigit(str));
		
		//to print duplicate from an string
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str = scan.next();
//		System.out.println(remDup2(str));
		
		
		
		
		
		
		//pallindome or not in another way
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str = scan.next();
//		if (pallindrome(str)) {
//			System.out.println("pallindrome");
//		}else {
//			System.out.println("not pallindrome");
//		}
		
		//pallindome or not
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str = scan.next();
//		String res = reverse(str);
//		if (str.equals(res)) {
//			System.out.println("pallindrome");
//		}else {
//			System.out.println(" not pallindrome");
//		}
		
		//REPLACE MIN OCCURENCE WITH MAX OCCURENCE
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str = scan.next();
//		System.out.println(replaceMinWithMax(str));
		
		//REPLACE A CHARACTER WITH GIVEN CHARACTER IN A GIVEN STRING
//		System.out.println("enter a string");
//		String str = scan.next();
//		System.out.println("enter a char");
//		char ch = scan.next().charAt(0);
//		System.out.println("enter a char to be replace");
//		char chTober = scan.next().charAt(0);
//		System.out.println(replace(str, ch, chTober));
		
		
		
		
		
		//Check max ocuurence of character in a given String
		//maxOccOfChar(str);
		
		//Check the frequency of given string by removing duplicate
//		minOccOf(str);
		
		
		//Check the frequency of given string by removing duplicate
//		frequencyOfChar(str);
		
		//TO REMOVE THE DUPLICATE
//		System.out.println(remDup(str));
		
		
		
		//TO CHECK THE FREQUENCY OF CHARACTER IN A STRING
		//frequenyOfChar(str);
		
		
		
		//TO CHECK A PARTICULAR CHAR IS PRESENT OR NOT
//		System.out.println("enter a character");
//		char ch = scan.next().charAt(0);
//		System.out.println(contain(str, ch));
//		if (contain(str, ch)) {
//			System.out.println(ch+ " is present");
//		}else {
//			System.out.println(ch+ " is not present");
//		}
		
		
		
		//System.out.println(LowerCase(str));
		//PRINT THE VOWEL FROM A GIVEN STRING 
		//vowelCount(str);
		
		
		
		
//		for (int i = 0; i < str.length(); i++) {
//			if (isPrime(i)) {
//				System.out.println(str.charAt(i));
//			}
//		}
//		printChar(str);
//		printEvenChar(str);

	}

}
