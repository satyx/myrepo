/*
Program to find a element in an bitonic array
*/

/*
Logic: Consider the middle element.If mismatch, divide the set into two parts. 
	case 1: left would be ascending and right would be descending (if the middle element was the critical element)
	case 2: left would be ascending and right would be bitonic
	case 3: left would be bitonic and right would be descending

	Using recursion solve this problem.
*/

import java.util.*;
class find_num
{
	int x;						
	public static void main(String args[])
	{
		int num[];

		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of test cases: ");
		int test=scan.nextInt();
		while(test-->0)
		{
		
			System.out.print("Enter number of elements in the bitonic array: ");
			int n=scan.nextInt();
			num=new int[n];

			System.out.println("Enter the elements: ");
			for(int i=0;i<n;i++)
				num[i]=scan.nextInt();

			find_num ob=new find_num();

			System.out.print("Enter the number which you want to search: ");
			ob.x=scan.nextInt();
	
			if(ob.bitonic(num,0,n-1)==1)
				System.out.println("Found");
			else
				System.out.println("Not Found");
		}
	}

	public int bitonic(int num[], int a, int b)
	{
		int mid=(a+b)/2;
		if(num[mid]==x)
			return 1;
		
		if(a==b)
			return 0;
		if(a==mid)
		{
			if(num[b]==x)
				return 1;
			else
				return 0;
		}
		if(num[a]<num[mid]&&num[b]<num[mid])
		{
			if((linear_asc(num,a,mid-1)==1)||(linear_dsc(num,mid+1,b)==1))
				return 1;
			else
				return 0;
		}
		if(num[mid-1]<num[mid]&&num[mid]<num[mid+1])
		{
			if((linear_asc(num,a,mid-1)==1)||(bitonic(num,mid+1,b)==1))
				return 1;
			else
				return 0;
		}
		if(num[mid-1]>num[mid]&&num[mid]>num[mid+1])
		{
			if((bitonic(num,a,mid-1)==1)||(linear_dsc(num,mid+1,b)==1))
				return 1;
			else
				return 0;
		}
		return 0;
	}

	public int linear_asc(int num[],int a,int b)
	{
		while(a<=b)
		{
			if(num[(a+b)/2]==x)
				return 1;
			else if(num[(a+b)/2]<x)
				a=(a+b)/2+1;
			else
				b=(a+b)/2-1;
		}
		return 0;
	}

	public int linear_dsc(int num[],int a,int b)
	{
		while(a<=b)
		{
			if(num[(a+b)/2]==x)
				return 1;
			else if(num[(a+b)/2]<x)
				b=(a+b)/2-1;
			else
				a=(a+b)/2+1;
		}
		return 0;
	}
}
