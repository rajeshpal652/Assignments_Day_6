package day_6;
/*
 * Author: Rajesh
 *Program to find a number is Prime or not.
 */
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int i,m=0,flag=0;    
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number to check is it prime :");
		int  checkPrime=sc.nextInt(); 
		m=checkPrime/2;      
		if(checkPrime==0||checkPrime==1){  
		   System.out.println(checkPrime+" is not prime number");      
		}else{
			
		    for(i=2;i<=m;i++){      
		    if(checkPrime%i==0){      
		     System.out.println(checkPrime+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(checkPrime+" is prime number"); }  
		  } 

	}

}
