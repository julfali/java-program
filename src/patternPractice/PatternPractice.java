package patternPractice;

public class PatternPractice {

	public static void main(String[] args) {
//		int num =5;
//		char ch = 'A';
//		for (int i = 1; i <=num; i++) {
//			int n =1;
//	
//			for (int j = 1; j < 2*num; j++) {
//				if (i>=j || i+j>= 2*num) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//		    }
//			System.out.println();
//			
//		}
		
		//NUMBER PATTERN
//		int num =5;
//		char ch = 'A';
//		for (int i = 1; i <=num; i++) {
//			int n =i;
//	        int m = 0;
//			for (int j = 1; j <=num; j++) {
//				if (j%2 != 0) {
//					System.out.print(n +" ");
//					n = n+2*num; 
//				}else {
//					m = j*num-i+1;
//					System.out.print(m+ " ");	
//				}
//		    }
//			System.out.println();
//		}
		
		
//		int num =3;
//		char ch = 'A';
//		for (int i = 1; i < 2*num; i++) {
//			int n =i;
//	        int m = 0;
//			for (int j = 1; j <=num; j++) {
//				if (i>=j && i+j<= 2*num) {
//					if (i==j || i+j ==2*num) {
//					   System.out.print(j +" ");	
//					}else{
//						System.out.print(j +"* ");
//					}
//					 
//				}else {
//					System.out.print("  ");	
//				}
//		    }
//			System.out.println();
//		}
		
		
		
//		int num =3;
//		char ch = 'A';
//		int n =11;
//		for (int i = 1; i < 2*num; i++) {
//			
//	        int m = 0;
//			for (int j = 1; j < 2*num; j++) {
//				System.out.print(n++ +" ");
//		    }
//			System.out.println();
//		}
		
		
//		int num =5;
//		char ch = 'A';
//		for (int i = 1; i <= num; i++) {
//			int n =i*2;
//	        int m = 0;
//			for (int j = 1; j <= num; j++) {
//					System.out.print(n+ " ");
//					n = n+2*num;
//				}
//			System.out.println();
//		    }
		
		
		
			
		
//		int num = 3;
//		for (int i = 1; i <= num; i++) {
//			int n = 1;
//			int m = i-1;
//			for (int j = 1; j < 2*num; j++) {
//				if (i+j >= num+1 && j-i<= num-1) {
//					if (j<=num) {
//						System.out.print(n++ +" ");
//					}else {
//						System.out.print(m-- +" ");
//					}
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
//		int num = 3;
//		for (int i = 1; i <= num; i++) {
//			int n = i;
//			int m = 1;
//			for (int j = 1; j < 2*num; j++) {
//				if (i+j >= num+1 && j-i<= num-1) {
//					if (j<=num) {
//						System.out.print(n-- +" ");
//					}else {
//						System.out.print(++m +" ");
//					}
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
//		int num = 5;
//		for (int i = 1; i <= num; i++) {
//			int n =i;
//			int m=0;
//			for (int j = 1; j <= num; j++) {
//				if (j%2 != 0) {
//					System.out.print(n+ " ");
//		            n+= 2*num;	
//				}else {
//					m = j*num+1-i;
//					System.out.print(m+ " ");
//				}
//			}
//			System.out.println();
//		}
		
//		int num = 3;
//		for (int i = 1; i < 2*num; i++) {	
//			for (int j = 1; j <= num; j++) {
//		         if (i>=j && i+j<= 2*num) {
//		        	 if (i==j || i+j==2*num) {
//		        		 System.out.print(j);
//					}else {
//						System.out.print(j+"* ");
//					}
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		int num = 3;
//		int n = 11;
//		for (int i = 1; i < 2*num; i++) {	
//			for (int j = 1; j < 2*num; j++) {
//		         System.out.print(n++ +" ");
//			}
//			System.out.println();
//		}
		
//		int num = 5;
//		for (int i = 1; i <= num; i++) {
//			int n = i*2;
//			for (int j = 1; j <= num; j++) {
//		         System.out.print(n +" ");
//		         n = n+2*num;    
//			}
//			System.out.println();
//		}
		
//		int num = 5;
//		for (int i = 1; i <= num; i++) {
//			int n = i*2;
//			for (int j = 1; j <= num; j++) {
//		         System.out.print(n +" ");
//		         n = n+2*num;    
//			}
//			System.out.println();
//		}
		
		// question from net
		//It creates a diagonal pattern of X characters. 
		
//		int num = 5;
//		for (int i = 1; i <= num; i++) {
//			int n = i*2;
//			for (int j = 1; j <= num; j++) {
//				if (i==j || i+j == num+1) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//		         
//			}
//			System.out.println();
//		}
		
		
//		int num = 3;
//		for (int i = 1; i <= num; i++) {
//			int n = i*2;
//			for (int j = 1; j < 2*num; j++) {
//				if (i+j>=num+1 && j-i<num) {
//					if (i<=j) {
//						System.out.print(1+ " ");
//					}
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		int num= 3;
//		char ch = 'A';
//		for (int i = 1; i <= num; i++) {
//			int n = 1;
//			int m = i;
//			for (int j = 1; j < 2*num; j++) {
//				if (i+j>=num+1 && j-i<num) {
//					if (j<=num) {
//						System.out.print(n++ +" ");		
//					}else {
//						System.out.print(--m +" ");
//					}
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		int num= 3;
//		char ch = 'A';
//		for (int i = 1; i <= num; i++) {
//			int n = i;
//			int m = 0;
//			for (int j = 1; j < 2*num; j++) {
//				if (num%2 != 0) {
//					System.out.print(n++ +" ");
//					n+= 2*num;
//				}else {
//					m= j*num+1-i;
//					
//				}
//			}
//			System.out.println();
//		}
		
	}

}
