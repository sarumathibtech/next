import java.io.*;
import java.util.*;

public class factorial
{
	public static void main(String args[])
	{
		int n,fact=1,i;
		Scanner ob=new Scanner(System.in);
			System.out.println("Enter the N value:");
				n=ob.nextInt();
			for(i=n;i>=0;i--)
			{
				if(i==0)
				{
					fact*=1;
				}
				else
				{
					fact*=i;
				}
			}
			
			System.out.println(n+" factorial is "+fact);
		
	}
}
