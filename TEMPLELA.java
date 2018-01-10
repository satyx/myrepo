import java.util.*;
class TEMPLELA
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			int n=scan.nextInt();
			int arr[]=new int[n];
			int flag=0;
			if(n%2==0)
				flag=-1;
			int d=0;
			for(int i=0;i<n/2+1;i++)
			{
				int c=scan.nextInt();
				if(c==d+1)
					d=c;
				else
					flag=-1;
			}
			for(int i=n/2+1;i<n;i++)
			{
				int c=scan.nextInt();
				if(c==d-1)
					d=c;
				else
					flag=-1;
			}
			if(flag==-1)
				System.out.println("no");
			else
				System.out.println("yes");
			
			
		}
	}
}
