import java.io.*;
import java.util.*;
import java.lang.*;
public class number
{
	public static void main(String args[])
	{
		
		int sum=0,odd_sum=0,i=1;
		while(i<=45)
		{ 
			if(i<=15)
				sum+=i;
			if(i>=15)
				if(i%2>0)
					odd_sum+=i;
		i++;
						
		}
		System.out.println("\nsum of 0 to 15 is "+sum+"\n\nsum of 15 to 45 odd number is "+odd_sum);
	}
}
