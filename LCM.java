import java.io.*;
import java.util.*;
import java.lang.*;
public class LCM
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the a ana b values:");
		int a=ob.nextInt();
		int b=ob.nextInt();
		int i=1,r1,al=0 ,temp=a,temp1=b;
		
		while(b>0)
		{
			r1=b;
			b=a%b;
			a=r1;
		}
		r1=(temp*temp1)/a;
		System.out.println("LCM of "+temp+" "+temp1+" is "+ r1);
	}
}
