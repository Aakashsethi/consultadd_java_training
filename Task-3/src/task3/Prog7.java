package task3;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int days = 0;
		String Month_name = " ";
		System.out.print("Input a month number: ");
		int month = sc.nextInt();
		System.out.print("Input a year: ");
        int year = sc.nextInt();
        switch (month) {
        case 1:
        	Month_name = "jan";
        	days =31;
        	break;
        case 2:
        	Month_name = "feb";
        	 if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
        	 {
                 days = 29;
             } 
        	 else {
                 days= 28;
             		}
             break;
        case 3:
        	Month_name = "mar";
        	days =31;
        	break;
        case 4:
        	Month_name = "apr";
        	days =30;
        	break;
        case 5:
        	Month_name = "may";
        	days =31;
        	break;
        case 6:
        	Month_name = "jun";
        	days =30;
        	break;
        case 7:
        	Month_name = "jul";
        	days =31;
        	break;
        case 8:
        	Month_name = "aug";
        	days =31;
        	break;
        case 9:
        	Month_name = "sep";
        	days =30;
        	break;
        case 10:
        	Month_name = "oct";
        	days =31;
        	break;
        case 11:
        	Month_name = "nov";
        	days =30;
        	break;
        case 12:
        	Month_name = "dec";
        	days =31;
        	break;
        	
        	

	}
        System.out.print(Month_name + " " + year + " has " + days + " days\n");
	}

}
