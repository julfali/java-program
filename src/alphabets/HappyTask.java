package alphabets;

public class HappyTask {

	public static void main(String[] args) {
          char ch = 'A';
          int num =4;
		for (int r = 1; r<=num; r++) {
			for(int c=1; c<=2*num-1; c++ ) {
			 if((r==1&&(c==4))|| (r==2&&(c==3||c==5))||(r==3&&(c==2||c==3||c==5||c==6))||(r==4&&(c==1||c==7))) {
				 System.out.print(ch +"");
			 }else {
			    System.out.print(" "); 
			 }
			  
			}
			System.out.println();
		} 

	}

}
