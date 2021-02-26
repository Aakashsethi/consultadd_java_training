package java_swap;

import java.util.Scanner;

public class Main_swap {

	public static void main(String[] args) {
		int x, y, t;// x and y are gonne be swap   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of X and Y");  
	       x = sc.nextInt();  
	       y = sc.nextInt();  
	       System.out.println("before swapping numbers: "+x +"  "+ y);  
	       /*swapping function  */  
	       t = x;  
	       x = y;  
	       y = t;  
	       System.out.println("After swapping: "+x +"   " + y);  
	       System.out.println( );  

	}

}
