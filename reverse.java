import java.io.*;
import java.util.*;
import java.lang.*;

public class reverse
{
	public static void main(String args[])
	{
			int n,r,value=0,temp,len=0,i=0;
		Scanner ob=new Scanner(System.in);
		
		System.out.println("enter the n value:");
			n=ob.nextInt();
			temp=n;
			while(temp>0)
			{
				temp=temp/10;
				len++;
			}
			temp=n;
			while(temp>0)
			{
				r=temp%10;
				value+=r*Math.pow(10,(len-i-1));
				i++;
				temp=temp/10;
			}
			System.out.println(n+" revering number is "+value);
	}
}
