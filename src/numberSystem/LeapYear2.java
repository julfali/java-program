package numberSystem;
import java.util.Scanner;
public class LeapYear2 {

	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		System.out.println("enter year");
		int year = sacn.nextInt();
		System.out.println("enter month");
		int month = sacn.nextInt();
	    switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println("31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("30 days");
           break;
		case 2:if (year%400 ==0|| year%4 ==0 && year%100 != 0) {
			System.out.println("29 days");
		}else {
			System.out.println("28 days");
		}
           
		default:
			break;
		

	}
 }
}
