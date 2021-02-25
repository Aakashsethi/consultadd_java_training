package tasktwo;

import java.util.Scanner;

public class Java_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("Enter a number");
		x= sc.nextInt();
		if (x<0) {
			System.out.println("it's over");
			break;
		
	
		}
		else {
			System.out.println("Good Going");
			continue;
		}
	}
	}

}
