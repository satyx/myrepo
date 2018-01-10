import java.util.*;
class CHEFROUT
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			String str=scan.next();
			char d=str.charAt(0);
			int flag=1;
			for(int i=1;i<str.length();i++)
			{
				char c=str.charAt(i);
				if(d=='C')
					d=c;
				else if(d=='E')
				{
					if(c=='C')
					{
						flag=-1;
						break;
					}
					else
						d=c;
				}
				
				else if(d=='S')
				{
					if(c=='C'||c=='E')
					{
						flag=-1;
						break;
					}
					else
						d=c;
				}
			}
				
			if(flag==1)
				System.out.println("yes");
			else
				System.out.println("no");
					
		}
	}
}
