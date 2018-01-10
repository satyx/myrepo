import java.util.*;
class LIKECS01
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			String str=scan.next();
			int flag=-1;
			for(int i=0;i<str.length()-1;i++)
				for(int j=i+1;j<str.length();j++)
					if(str.charAt(i)==str.charAt(j))
					{
						flag=1;
						break;
					}
			if(flag==-1)
				System.out.println("no");
			else
				System.out.println("yes");
		}
	}
}

