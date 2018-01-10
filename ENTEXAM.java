import java.util.*;
class ENTEXAM
{
	
	public int[] merge(int B[],int C[])
	{
		int b=0,c=0;
		int arr[]=new int[B.length+C.length];
		for(int i=0;i<arr.length;i++)
		{
			if(b==B.length)
			{
				arr[i]=C[c++];
			}
			else if(c==C.length)
			{
				arr[i]=B[b++];
			}
			else
			{
				if(B[b]<=C[c])
					arr[i]=B[b++];
				else
					arr[i]=C[c++];
			}
		}
		return arr;
	}

	public int[] divide(int arr[],int n)
	{
		if(n==1)
			return arr;
		int m=n/2;
		int arr1[]=new int[m];
		int arr2[]=new int[n-m];
		
		for(int i=0;i<m;i++)
			arr1[i]=arr[i];
		for(int i=m;i<n;i++)
			arr2[i-m]=arr[i];
		arr1=divide(arr1,m);
		arr2=divide(arr2,n-m);
		arr=merge(arr1,arr2);
		return arr;
	}

	public static void main(String args[])
	{
		ENTEXAM ob=new ENTEXAM();		
		Scanner scan = new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			int n=scan.nextInt();
			int k=scan.nextInt();
			int e=scan.nextInt();
			int m=scan.nextInt();
			int selfscr=0;
			int N[]=new int[n-1];
			for(int j=0;j<n-1;j++)
				N[j]=0;
			for(int i=0;i<n-1;i++)
				for(int j=0;j<e;j++)
					N[i]+=scan.nextInt();
			
			for(int i=0;i<e-1;i++)
				selfscr+=scan.nextInt();
			
			N=ob.divide(N,n-1);				//sorting using merge sort 
				if(N[n-k-1]<selfscr+m)
					System.out.println(N[n-k-1]-selfscr+1);
				else
					System.out.println("Impossible");
			}
		

			
		}
	}
}
