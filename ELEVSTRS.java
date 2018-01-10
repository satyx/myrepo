import java.util.*;
class ELEVSTRS
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			double n=scan.nextDouble();
			double v1=scan.nextDouble();
			double v2=scan.nextDouble();
			if((Math.sqrt(2)/v1)>=(2.0/v2))
				System.out.println("Elevator");
			else
				System.out.println("Stairs");
		}
	}
}
			
