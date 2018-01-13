import java.util.*;
class lcs
{
	int arr[][];
	public int Max(String s1, String s2,int l1,int l2)
	{
		if(l1==1||l2==1)
		{
			for(int i=0;i<l1;i++)
			{
				for(int j=0;j<l2;j++)
					if(s1.charAt(i)==s2.charAt(j))
						return 1;
			}
			return 0;
		}
		if(s1.charAt(l1-1)==s2.charAt(l2-1))
		{
			if (arr[l1-2][l2-2]!=-1)
				arr[l1-1][l2-1]=arr[l1-2][l2-2]+1;
			else
				arr[l1-1][l2-1]=1+Max(s1.substring(0,l1-1),s2.substring(0,l2-1),l1-1,l2-1);

			return arr[l1-1][l2-1];
		}
		else
		{
			int a=0,b=0;
			if(arr[l1-2][l2-1]!=-1)
				a=arr[l1-2][l2-1];
			else
				a=Max(s1.substring(0,l1-1),s2.substring(0,l2),l1-1,l2);
			
			if(arr[l1-1][l2-2]!=-1)
                                b=arr[s1.length()-1][s2.length()-2];
			else
				b=Max(s1.substring(0,l1),s2.substring(0,l2-1),l1,l2-1);


			return Math.max(a,b);
		}
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			lcs ob=new lcs();
	       		 int l1=scan.nextInt();
               		 int l2=scan.nextInt();
			ob.arr=new int[l1][l2];

			for(int i=0;i<l1;i++)
				for(int j=0;j<l2;j++)
					ob.arr[i][j]=-1;

			 String s1=scan.next();
			String s2=scan.next();
			
			int l=ob.Max(s1,s2,l1,l2);
			System.out.println(l);
		}
	}
}
