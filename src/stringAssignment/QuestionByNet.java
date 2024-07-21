package stringAssignment;

import java.util.Scanner;

public class QuestionByNet {
	
//	Write a program in any programming language you to find the
//	first non-repeated character in a given String, for example,
//	if the given String is "Java" then the first non-repeated character is "J"
	
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
	
	//-------------------------------------------------------------------------------------------------------------------------------
//	How to print the duplicate characters from the given String? (solution)
//	Write an efficient java program to return the 
//	duplicate characters from given String, for example, if given String is "C++" 
//    then your program should print "+" Similarly, if the input is "Java and JavaScript" 
//	then your program should print "J", "a" and "v". You can ignore the case for finding duplicates.

	public static String remDup2(String str) {
		String res = "";
		String res2 ="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!(res.contains(ch+""))) {
				res=res+ch;
			}
		}
		return res ;
	}		
	//------------------------------------------------------------------------------------
//	Write an efficient method in Java to remove all occurrences of a given character in Java.
//	For example, if the given String is "Programming" and the given character to remove is "m" 
//	then your function should return "Prograing".
	public static void remove(String str ,char ch) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch2 = str.charAt(i);
			if (ch==ch2) {
				res = str.replaceAll(ch+"", "");					
			}
		}
	
	}
	//-----------------------------------------------------------------------------------
	
	//WAP TO REPLACE CHARACTER AT SPECIFIC INDEX
	public static String replaceOnIndex(String str, char chToRep, int index) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(index);
			if (ch != chToRep) {
				res = str.replaceFirst(ch+"",chToRep+"");	
			}else {
				res =str;
			}		
		}
		return res;
	}
	//---------------------------------------------------------------------------------------
	
	//PROGRAM TO FETCH CHARACTER FROM A GIVEN STRING FOR SPECIFIC INDEX
	public static char fetchChar(String str, int index) {
		char ch = ' ';
		for (int i = 0; i < str.length(); i++) {
			char chToRet= str.charAt(index);
			ch= chToRet;
		}
		return ch;
	}
	
	public static void main(String[] args) {
		String s = "abcaabba" ;
		System.out.println(s);
		String r =remDup2(s);
		System.out.println(r);
		for(int i = 0 ; i < r.length() ; i++)
		{
			int count =0 ;
			for(int j = 0 ; j < s.length() ; j++)
			{
				if(r.charAt(i) == s.charAt(j))
				{
					count++ ;
					if(count == 2) {
					System.out.print(r.charAt(i)); break;
					}
				}
			}
		}
		
		
		//PROGRAM TO FETCH CHARACTER FROM A GIVEN STRING FOR SPECIFIC INDEX
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str = scan.next();
//		System.out.println("enter a index");
//		int index = scan.nextInt();
//		System.out.println(fetchChar(str,index ));
		
		//WAP TO RPLACE CHARACTER AT SPECIFIC INDEX
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str = scan.next();
//		System.out.println("enter a index");
//		int index = scan.nextInt();
//		System.out.println("enter a charactr");
//		char ch = scan.next().charAt(0);
//		System.out.println(replaceOnIndex(str, ch, index));
		//------------------------------------------------------------------------------
		
		
//		Write an efficient method in Java to remove all occurrences of a given character in Java.
//		For example, if the given String is "Programming" and the given character to remove is "m" 
//		then your function should return "Prograing".
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str = scan.next();
//		System.out.println("enter a charactr");
//		char ch = scan.next().charAt(0);
//		System.out.println(remove(str,ch));
		//-------------------------------------------------------------------
		

		//-------------------------------------------------------------------------
		
		
		
//		Write a program in any programming language you to find the
//		first non-repeated character in a given String, for example,
//		if the given String is "Java" then the first non-repeated character is "J"
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string");
//		String str1 = scan.next();
//		System.out.println(firstNonReapChar(str1));
		

	}

}
