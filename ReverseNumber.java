package day_6;
/*
 * Author: Rajesh
 *Program to reverse a number
 */
import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int reverse = 0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number for reverse : ");
		int number =sc.nextInt();
		
		while(number != 0) {
			
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}

}
