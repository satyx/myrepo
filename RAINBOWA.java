import java.util.*;
class RAINBOWA
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			int n=scan.nextInt();
			int num[]=new int[n];
			int flag=1,c=1;
			num[0]=scan.nextInt();
			if(num[0]!=1)
				flag=-1;
			for(int i=1;i<n;i++)
			{
				num[i]=scan.nextInt();
				if(num[i]==num[i-1]+1)
				{
					c++;
				}
				if(num[i]!=num[i-1]+1&&num[i]>num[i-1])
					flag=-1;
				if(num[i]!=num[i-1]-1&&num[i]<num[i-1])
					flag=-1;
				
			}
			if(c!=7)
				flag=-1;
			if(flag!=-1)
			{

				for(int i=0;i<n/2;i++)
				{
					if(num[i]!=num[n-1-i])
					{
						flag=-1;
						break;
					}
				}
			}

			if(flag==1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
			
