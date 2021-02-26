package task3;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		int x,i,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:"); 
		x = sc.nextInt();
		System.out.print("Enter limit:"); 
		n = sc.nextInt();
			for(i=1;i<=n;i++) {
				System.out.println(x+"*"+i+"="+x*i);
				
			}
			
		
		
	}

}
