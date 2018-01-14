import java.util.*;
class ugly
{
	int num[];
	public static void main(String args[])
	{
		ugly ob=new ugly();
		Scanner scan = new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			int n=scan.nextInt();
			ob.num=new int[n];

			ob.num[0]=1;

			int check=1;
			for(int i=1;i<=n;i++)
			{
				int a=ob.if_ugly(i);
				if(a==1)
					System.out.println(i);
			}
		
		}
	}

	public int if_ugly(int i)
	{
		if(num[i-1]==1)
			return 1;
		if(num[i-1]==-1)
			return 0;
		
		if(i%5==0)
		{
			num[i-1]=if_ugly(i/5);
			return num[i-1];
		}
		else if(i%3==0)
		{
			num[i-1]=if_ugly(i/3);
			return num[i-1];
		}
		else if(i%2==0)
		{
			num[i-1]=if_ugly(i/2);
			return num[i-1];
		}
		else
			num[i-1]=-1;
			return -1;
	}
}                                              
