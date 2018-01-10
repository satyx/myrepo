import java.io.*;
public class LAPIN
{
        public static void(String args[])
        {
                Scanner scan=new Scanner(System.in);
                int test=scan.nextInt();
                while(test-->0)
                {
			String str=scan.next();
			int arr[]=new int[26];
			for(int i=0;i<26;i++)
				arr[i]=0;
			for(int i=0;i<str.length()/2;i++)
			{
				arr[(int)(str.charAt(i)-97)]++;
			}
			
			for(int i=str.length()-1;i>str.length()/2	
