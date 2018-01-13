import java.util.*;
class MaxSumContiguous
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		while(test-->0)
		{
			int n=scan.nextInt();
			int num[]=new int[n];
			int sum[]=new int[n];

			for(int i=0;i<n;i++)
				num[i]=scan.nextInt();
			
			int a=0,b=Integer.MIN_VALUE;			

			for(int i=0;i<n;i++)
			{
				a+=num[i];
				if(a>b)
					b=a;
			
				sum[i]=b;
				if(a<0)
					a=0;
			}
			System.out.println(sum[n-1]);

		}
	}
}

