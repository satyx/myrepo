import java.io.*;
class NITIKA
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		while(test-->0)
		{
			
			String name=br.readLine();
			String fname[]=name.split(" ");			
			if(fname.length==1)
			{
				fname[0]=name.toLowerCase();
				fname[0]=(char)(fname[0].charAt(0)-32)+fname[0].substring(1);
				System.out.println(fname[0]);
			}
			
			else
			{
				for(int i=0;i<fname.length-1;i++)
				{
					char c=fname[i].charAt(0);
					if(c>96&&c<123)
						fname[i]=Character.toString((char)((int)c-32));
					else
						fname[i]=Character.toString(c);
					fname[i]+=".";
					System.out.print(fname[i]+" ");
				}
				fname[fname.length-1]=fname[fname.length-1].toLowerCase();
				fname[fname.length-1]=(char)(fname[fname.length-1].charAt(0)-32)+fname[fname.length-1].substring(1);
				System.out.println(fname[fname.length-1]);
			}
			
			
		}
	}
}

