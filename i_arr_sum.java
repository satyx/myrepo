
/*
Program to compute the maximum value of summation of i*arr[i] of an array after every rotation
*/
import java.util.*;
class i_arr_sum
{
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the number of test cases: ");
		int test=scan.nextInt();
		while(test-->0)
		{
			System.out.print("Enter number of elements: ");
			int n=scan.nextInt();
			int arr[]=new int[n];
			int req_sum=0,sum=0;
			for(int i=0;i<n;i++)
			{
				arr[i]=scan.nextInt();
				req_sum+=i*arr[i];
				sum+=arr[i];
			}
			int prev_sum=req_sum;
			for(int i=0;i<n-1;i++)
			{
				prev_sum=prev_sum-(sum-arr[i])+(n-1)*arr[i];
				if(prev_sum>req_sum)
					req_sum=prev_sum=prev_sum;
			}
			System.out.println("Required sum= "+req_sum);
		}
	}
}
			
