package tasktwo;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float first, second, result,first1,second2;
		int pick;
		System.out.println("Enter first number:");

	       first = sc.nextFloat();

	       System.out.println("Enter second number:");

	       second = sc.nextFloat();
	       
	       System.out.println("PRESS\n "
	    		   	 + " 1 TO ADD \n " 
		    		 + " 2 TO SUBSTRACT \n"  
		    		 + " 3 TO MULTIPLY \n" 
		    		 + " 4 TO DIVIDE \n " 
		    		 + " 5 TO GET AVERAGE:");
	       
	       pick = sc.nextInt();
	       
	       switch(pick) {
	       
	       case 1:
	    	   result= first+second;
	    	   
	    	   System.out.println(result);
	    	   break;
	    	   
	       case 2:
	    	   result = first-second;
	    	   System.out.println(result);
	    	   
	    	   break;
	       case 3:
	    	   result = first*second;
	    	   System.out.println(result);
	           break;
	       case 4:
	    	   if (first<0) {
	    		   System.out.println("error");
	    		   
	    	   }
	    	   else {
	    	   result = first/second;
	    	   System.out.println(result);
	    	   }
	    	   
	    	   break;
	       case 5:
	    	   System.out.println("enter first1");
	    	   first1 = sc.nextFloat();
	    	   System.out.println("enter second2");
	    	   second2 = sc.nextFloat();
	    	   result = (first+second+first1+second2)/4;
	    	   if(result<0)
	    	   {
	    		   System.out.println(" Oops option X(1/2/3/4/5) is returning the negative number ");
	    	   }
	    	   else {
	          
		    System.out.println(result);
	    	   }
           break;
	    	  
	    	   
	       
	       }

	}

}
