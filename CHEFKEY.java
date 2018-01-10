import java.util.*;
class CHEFKEY
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			int c=scan.nextInt();
			int pair=0;
			int min=Math.min(n,m);
			int l=(int)Math.ceil((double)c/Math.max(n,m));
			
			for(int i=l;i<=min;i++)
			{
				if(c%i==0)
					pair++;
			}
			System.out.println(pair);
					
		}
	}
}
