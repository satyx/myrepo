import java.util.*;
class SNELECT
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			String str=scan.next();
			int snake=0,mong=0;
			
			str=str+" ";
			for(int i=0;i<str.length()-1;i++)
			{
				if(str.charAt(i)=='m')
				{
					mong++;
					if(str.charAt(i+1)=='s')
						i++;
				}
		
				else if(str.charAt(i)=='s')
				{
					if(str.charAt(i+1)=='m')
					{		
						mong++;
						i++;
						continue;
					}
					snake++;
				}
			}

			if(mong>snake)
				System.out.println("mongooses");
			else if(snake>mong)
				System.out.println("snakes");
			else
				System.out.println("tie");
		
		}
	}
}
