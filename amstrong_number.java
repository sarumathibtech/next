import java.io.*;
import java.util.*;
import java.lang.*;

public class ams_number
{
	public static void main(String args[])
	{
			int n,r,temp1=0;
			Scanner ob=new Scanner(System.in);
		
			System.out.println("Enter the n value:");
			
			n=ob.nextInt();
			int temp=n;
			while(temp>0)
			{
				r=temp%10;
					temp1+=(r*r*r);
					temp=temp/10;
			}
			if(n==temp1)
				System.out.println("the number "+n+" is amstrong number");
			else
				System.out.println("the number "+n+" is  not a amstrong number");

	}
}
			
