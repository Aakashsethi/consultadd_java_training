package tasktwo;

public class FlowDiagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		
		int avg = (a+b+c)/2;
		System.out.println("Average"+ avg);
		if(avg>a && avg>b && avg>c)
		{
			System.out.println("Average is higher than a,b,c");
		}
		else if(avg>a && avg>b)
		{
			System.out.println("Average is higher than a,b");
		}
		else if(avg>a && avg>c)
		{
			System.out.println("Average is higher than a,c");
		}
		else if(avg>b && avg>c)
		{
			System.out.println("Average is higher than b,c");
			}
		else if(avg>a)
		{
			System.out.println("Average is just higher than a");
		}
		else if(avg>b)
		{
			System.out.println("Average is just higher than b");
		}
		else if(avg>c)
		{
			System.out.println("Average is just higher than c");
		}
	}

}
