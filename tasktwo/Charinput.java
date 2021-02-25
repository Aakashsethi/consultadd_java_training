package tasktwo;

import java.util.Scanner;

public class Charinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word/sentence:");
		c = sc.next().charAt(0);
		c = Character.toLowerCase(c);
		if(c=='r' || c=='a' || c=='n'|| c=='d'|| c=='o'|| c=='m' )
        {
            System.out.println("FOUND.");
        }
        else
            System.out.println("NOT FOUND.");

	}

}
