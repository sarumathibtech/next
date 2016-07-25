import java.io.*;
import java.util.*;
import java.lang.*;

public class amstrong
{
	public static void main(String args[])
	{
			int start,end,p,r,sum=0;
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter the start and end interval:");
			start=ob.nextInt();
			end=ob.nextInt();
			System.out.println("Amstrong numbers are between "+start+" "+end+":");
		while(start<=end)
		{ p=start;
			while(p>0)
			{
				r=p%10;
				sum+=(r*r*r);
				p=p/10;
			}
				
			if(sum==start)
				System.out.print(start+" ");
			start++;
			sum=0;
		}
			
	}
}
