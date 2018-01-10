import java.io.*;
class LOSTMAX
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		while(test-->0)
		{
			long max=0;
			String inp=br.readLine();
			String number[]=inp.split(" ");			
			int c=0;
			long num[]=new long[50];
			
			for(int i=0;i<number.length;i++)
			{
				long n=Long.parseLong(number[i]);
				if(max<n)
				{
					if(n==number.length-1&&c!=1)
					c=1;
					else
					max=n;
				}
			}
			System.out.println(max);
			
			
			
			
		}
	}
}
			
