package tasktwo;

import java.util.Scanner;

public class Conditional_actions {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		x= sc.nextInt();
	if(x % 2== 0) {
		if(x % 2==0 || x>2 || x<5) {
			System.out.println("OLD");
			
		}
		else if(x%2==0 || x>6||x<30) {
			System.out.println("NEW");
			
		}
		else if(x%2==0 || x > 30) {
			System.out.println("OLD");
			
		}
		
	}
	else {
		System.out.println("NEW");
	}

	}

}
