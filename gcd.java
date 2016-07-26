import java.io.*;
import java.util.*;

public class gcd
{
	public static void main(String args[])
	{
		int a,b,i;
		Scanner ob=new Scanner(System.in);
		
		System.out.println("enter the a and b value:");
		a=ob.nextInt();
		b=ob.nextInt();
	int	max=Math.max(a,b);
		System.out.print(max);
		for(i=max;i>=1;i--)
		{
				
				if(a%i==0 && b%i==0)
				{
					System.out.print("gcd of "+a+" and "+b+" is "+i);
					break;
				}
				
		}
		
				
	}
}
