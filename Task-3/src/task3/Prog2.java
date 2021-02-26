package task3;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		
		
		int i;
		double sum=0;
		Scanner sc = new Scanner(System.in);
		int x[]= new int[10];
		System.out.println("Enter 10 nos");
		
		for(i=0;i<10;i++) {
		x[i] = sc.nextInt();
		}
		for( i=0;i<10;i++) {
			 sum = sum+ x[i];
			 }
		System.out.println("Avg is"+ sum/10);
		
		}

}
