package java_swap;

import java.util.Scanner;

public class Tone3pro {

	public static void main(String[] args) {
		int x, y, z;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter two number each varing between 1-10");
		 x = sc.nextInt(); 
		 y = sc.nextInt(); 
		 if(x >10 && y>10) {
			 System.out.println("Type between 1-10");
		 }
		 else {
			 z = x+y;
			 System.out.println("True sum ::  "+ z);
		 }
		 z=+30;
		 System.out.println("added by 30 using variable value ::  "+ z);
	}

}
