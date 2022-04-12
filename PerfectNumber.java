package day_6;
/*
 * Author: Rajesh
 *Program to find if a number is perfect number or not
 */
import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		
		int devisor, number, Sum = 0 ;
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		number=sc.nextInt();
		
		for(devisor = 1 ; devisor < number ; devisor++) {
			if(number % devisor == 0)  {
				Sum = Sum + devisor;
			}
		}
		if (Sum == number) {
			System.out.println(number + " "+"is a Perfect Number");
		}
		else {
			System.out.println(number +" "+ "is NOT a Perfect Number");
		}
		
		

	}


}
