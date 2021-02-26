package task3;

import java.util.Scanner;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = sc.nextInt();
		System.out.println("Enter num2");
		num2 = sc.nextInt();
		System.out.println("Enter num3");
		num3 = sc.nextInt();
		if(num1<num2 || num2<num3 ) {
			System.out.println("INCREASING");
		}
		else if(num1>num2 || num2>num3 ) {
			System.out.println("DECREASING");
		}
		else {
			System.out.println("Neither Increasing or Decreasing");
		}

	}

}
