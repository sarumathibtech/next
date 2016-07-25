import java.io.*;
import java.util.*;

public class power
{
	public static void main(String args[]) 
	{
		
		int n,p,i=0,pow=1;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the N and P values:");
			n=ob.nextInt();
			p=ob.nextInt();
			while(i<p)
			{
				pow*=n;
				i++;
			}
			
			System.out.println(n+"^"+p+" is "+pow);
		
		
	}
	
}
