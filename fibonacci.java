import java.io.*;
import java.util.*;

public class fibonacci
{
	public static void main(String args[])
	{
		long a=-1,b=1,c,n,i;
		Scanner ob=new Scanner(System.in);
		
		System.out.println("how many fibonacci number you required:");
		n=ob.nextLong();
		
		for(i=0;i<=n;i++)
		{
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
		}
	}
}
