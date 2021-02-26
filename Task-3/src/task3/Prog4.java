package task3;

import java.util.Scanner;

public class Prog4 {
	  public static void main(String[] args) {

	        int num, count, total = 0;

	        /*A JAVA program that takes one integer input n from the user, 
	        and display all the no, print sum of n natural numbers. */
	        System.out.println("Enter the value of n in integer:");
	        //Scanner is used for reading user input
	        Scanner scan = new Scanner(System.in);
	        //nextInt() method reads integer entered by user
	        num = scan.nextInt();
	    
	       
	        for(count = 1; count <= num; count++){
	            total = total + count;
	        }

	        System.out.println("Sum of first "+num+" natural numbers is: "+total);
	    }
	}
