import java.io.*;
import java.util.*;

public class gcd_of_two_num
{
	public static void main(String args[])
	{
		int p,q,i;
		Scanner ob=new Scanner(System.in);
		
		System.out.println("enter the p and q value:");
		p=ob.nextInt();
		q=ob.nextInt();
	int	max=Math.max(p,q);
		System.out.print(max);
		for(i=max;i>=1;i--)
		{
				
				if(p%i==0 && q%i==0)
				{
					System.out.print("gcd of "+p+" and "+q+" is "+i);
					break;
				}
				
		}
		
				
	}
}
