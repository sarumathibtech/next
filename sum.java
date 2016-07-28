import java.io.*;
import java.util.*;
import java.lang.*;
public class sum
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=ob.nextInt();
		int sum=0,temp=n;;
		while(n>0)
		{
			sum+=n;
			n--;
		}
		System.out.println(sum);
	}
}
