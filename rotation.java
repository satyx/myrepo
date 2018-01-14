import java.util.*;
class rotation
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			int n=scan.nextInt();
			if(n<=0)
				continue;
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=scan.nextInt();

			int rot=scan.nextInt();
			int store[]=new int[rot];
			for(int i=0;i<rot;i++)
			store[i]=arr[i];
			for(int i=0;i<n-rot;i++)
				arr[i]=arr[i+rot];
			for(int i=n-rot;i<n;i++)
				arr[i]=store[i-n+rot];

			for(int i=0;i<n;i++)
				System.out.println(arr[i]);
		}
	}
}
