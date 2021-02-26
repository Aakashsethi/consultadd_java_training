package task3;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		
		long lg,sum=0;
	int count=0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number:");
	lg = sc.nextLong();
	
	while(lg!=0)
	{
		sum = sum + lg % 10;
		lg=lg/10;
		count++;
		
	}
	System.out.println("Number of digits are:"+ count);
	System.out.println("Sum of digits is:"+sum);
	
	
}
		

}

