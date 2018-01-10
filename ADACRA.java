import java.util.*;
class ADACRA
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			String str=scan.next();
			int up=0,down=0,flag=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='U'&&flag!=-1)
				{
					up++;
					flag=-1;
				}
				else if(str.charAt(i)=='D'&&flag!=1)
				{
					down++;
					flag=1;
				}
			}
			System.out.println(Math.min(up,down));
		}
	}
}
