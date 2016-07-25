import java.io.*;
import java.util.*;
import java.lang.*;

public class prime_number
{
	public static void main(String args[])
	{
			int start,end,i,j,p=0;
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter the start and end interval:");
			start=ob.nextInt();
			end=ob.nextInt();
			
		for(i=start;i<=end;i++)
		{
			p=0;
			for(j=2;j<=i-1;j++)
			{	
			
				if(i%j==0)
				{
					p=1;
				}
				
			}
			if(p==0)
				System.out.print(i+" ");
		}
			
	}
}
