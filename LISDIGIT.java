import java.util.*;
class LISDIGIT
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			int n=scan.nextInt();
			int num[]=new int[n];
			
			for(int i=0;i<n;i++)
				num[i]=scan.nextInt();

			for(int i=0;i<n;i++)
				System.out.print(num[i]);
			System.out.println();
		}
	}
}

