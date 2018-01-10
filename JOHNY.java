import java.util.*;
class JOHNY
{
	int numb,pos;
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		while(test-->0)
		{
			JOHNY ob=new JOHNY();
			int n=scan.nextInt();
			int num[]=new int[n];
			
			for(int i=0;i<n;i++)
				num[i]=scan.nextInt();

			int track=scan.nextInt();
			ob.numb=num[track-1];

			
			num=ob.divide(num,n);			
			
			System.out.println((ob.pos+1));
		}
	}

	public int[] divide(int A[],int num)
	{
		if(num==1)
			return A;
		else
		{
			int n=num/2;
			int B[]=new int[n];
			int C[]=new int[num-n];

			for(int i=0;i<n;i++)
				B[i]=A[i];
			for(int i=n;i<num;i++)
				C[i-n]=A[i];
			
			B=divide(B,n);
			C=divide(C,num-n);
			A=merge(B,C);
			return A;
		}
	}

	public int[] merge(int B[],int C[])
	{
		int b=0,c=0,index=0;
		int arr[]=new int[B.length+C.length];
		while(index<B.length+C.length)
		{
			if(b==B.length)
			{
				if(C[c]==numb)
					pos=index;	
				arr[index++]=C[c++];
			}
			else if(c==C.length)
			{
				if(B[b]==numb)
					pos=index;	
				arr[index++]=B[b++];
			}
			else if(B[b]<=C[c])
			{
				if(B[b]==numb)
					pos=index;	
				arr[index++]=B[b++];
			}
			else
			{
				if(C[c]==numb)
					pos=index;	
				arr[index++]=C[c++];
			}
			
		}
		return arr;	
	}
}
		
