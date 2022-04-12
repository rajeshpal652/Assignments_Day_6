package day_6;
/*
 * Author: Rajesh
 *Program of taking start time and stop time input in second from user and Printing the interval of elapsed time .
 */
import java.util.Scanner;

public class StopwatchProgram {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Start Time :");
	int Start=sc.nextInt();
	System.out.println("Enter Stop Time :");
	int Stop=sc.nextInt();
	
	int count=0;
	
	for(int i=Start;i<Stop;i++) {
		
		count=count+1;
			
		}
		System.out.print( "The Elapsed Time is : "+count+" Sec");

	}

}
