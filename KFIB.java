import java.util.*;
class KFIB
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		long k=scan.nextLong();
		long arr[]=new long[(int)k];
		
		for(int i=0;i<k;i++)
			arr[i]=1;
		int top=0;
		long sum=k;
		for(int i=0;i<n-k;i++)
		{
			long temp=arr[top];
			arr[top]=sum%1000000007;
			sum=(sum+arr[top]-temp)%1000000007;
			if(top==k-1)
				top=0;
			else top++;
		}
		
		
		if(top==0)
			System.out.println(arr[(int)k-1]);
		else
			System.out.println(arr[top-1]);		


	}
}

