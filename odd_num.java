import java.io.*;
import java.util.*;
import java.lang.*;

public class odd_num
{
	public static void main(String args[])
	{
			int start,end,i;
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter the start and end interval:");
			start=ob.nextInt();
			end=ob.nextInt();
			
		for(i=start;i<=end;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ");
		}
			
	}
}
