import java.util.*;
class SEGM01
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			String str=scan.next();
			int one=0,flag=0;
			for(int i=0;i<str.length()&&one<2;i++)
			{
				if(str.charAt(i)=='1'&&flag!=-1)
				{
					flag=-1;
					one++;
				}
				else if(str.charAt(i)=='0'&&flag!=1)
				{
					flag=1;
				}
			}
			System.out.println(one==1?"YES":"NO");
		}
	}
}
