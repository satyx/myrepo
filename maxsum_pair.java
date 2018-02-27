/*
Program to check if the sum of two element of an sorted and rotated array equals the input
*/


import java.util.*;
class maxsum_pair
{
	int sum;
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number of test cases: ");
		int test=scan.nextInt();
		while(test-->0)
		{
			System.out.print("Enter the number of elements: ");
			int n=scan.nextInt();
			int num[]=new int[n];
			System.out.println("Enter the elements of the sorted-rotated array:");
			for(int i=0;i<n;i++)
				num[i]=scan.nextInt();

			maxsum_pair ob=new maxsum_pair();
			System.out.print("Enter the pair sum you want to search: ");
			ob.sum=scan.nextInt();
			if(ob.maxsum(num,n))
				System.out.println("Successful Search");
			else
				System.out.println("Unsuccessful Search");
		}
	}

	public boolean maxsum(int num[],int n)
	{
		int m=findpivot(num,0,n-1),l;
		if(m==n-1)
			l=0;
		else
			l=m+1;
		for(int i=0;i<n;i++)
		{
			if(num[l]+num[m]==sum)
				return true;
			else if(num[l]+num[m]>sum)
				m=(m==0?n-1:m-1);
			else
				l=(l==n-1?0:l+1);
		}
		return false;
	}
			
	public int findpivot(int num[],int i,int f)
	{
		if(i==f)
			return i;
		int mid=(i+f)/2;
		if(mid==i)
		{
			return (num[i]>num[f]?i:f);
		}

		else if(num[mid-1]<num[mid]&&num[mid]<num[mid+1])
			return findpivot(num,mid+1,f);
		else
			return mid;
	}
}	
