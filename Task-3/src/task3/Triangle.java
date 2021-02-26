package task3;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j , num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number length");
		num = sc.nextInt();
		for(i=1;i<=num;i++) 
		{
			for(j=1;j<=i;j++) 
				System.out.print(j);
				
				System.out.println("");
			
			
		}

	}

}
