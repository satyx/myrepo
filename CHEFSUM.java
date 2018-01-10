import java.util.*;
class CHEFSUM
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0)
		{
			int n=scan.nextInt();
			int num[]=new int[n];
			int min=0;
			for(int i=0;i<n;i++)
			{
				num[i]=scan.nextInt();
				if(num[min]>num[i])
					min=i;
			}
			System.out.println(min+1);
		}
	}
}
	
