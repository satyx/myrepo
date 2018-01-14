import java.util.*;
class path_in_matrix
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		while(test-->0)
		{
			int n=scan.nextInt();
			int arr[][]=new int[n][n];

			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					arr[i][j]=scan.nextInt();

			int sum[][]=new int[n][n];
			int net_sum=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==0)
					{
						sum[i][j]=arr[i][j];
						 if(i==n-1)
                                                        if(net_sum<sum[i][j])
                                                                net_sum=sum[i][j];
					}
					else if(j==0)
					{
						sum[i][j]=arr[i][j]+Math.max(sum[i-1][j],sum[i-1][j+1]);
						if(i==n-1)
							if(net_sum<sum[i][j])
								net_sum=sum[i][j];
					}
					else if(j==n-1)
					{
						sum[i][j]=arr[i][j]+Math.max(sum[i-1][j],sum[i-1][j-1]);
						if(i==n-1)
                                                        if(net_sum<sum[i][j])
                                                                net_sum=sum[i][j];
                                        }
					else
					{
						sum[i][j]=arr[i][j]+Math.max(Math.max(sum[i-1][j-1],sum[i-1][j]),sum[i-1][j+1]);
						if(i==n-1)
                                                        if(net_sum<sum[i][j])
                                                                net_sum=sum[i][j];
                                        }
				}
			}

			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(sum[i][j]+" ");
				}
				System.out.println();
			}		
	System.out.println(net_sum);
		}
	}
}
