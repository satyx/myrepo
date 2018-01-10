import java.util.*;
class SNAKPROC
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			int n=scan.nextInt();
			String str=scan.next();
			int check=0;
			
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='.')
					continue;
				else if(str.charAt(i)=='H'&&check%2!=0)
				{
					break;
				}

				else if(str.charAt(i)=='T'&&check%2==0)
				{
					check++;
					break;
				}
				else
					check++;
			
			}
			System.out.println(check%2==0?"Valid":"Invalid");
		}
	}
}
