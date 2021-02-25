package tasktwo;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      int num = sc.nextInt();
	      
	
	     
	      if(num%15==0)
			{
				System.out.println("JAVA Training consultadd");
			}
			else if(num%5==0)
			{
				System.out.println("JAVA Training");
			}
			else if(num%3==0)
			{
				System.out.println(" cosultadd");
			}
			else
			{
				System.out.println("not divisible by 3 or 5");
			}

	      

	}

}
