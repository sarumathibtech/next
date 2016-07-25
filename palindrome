import java.io.*;
import java.util.*;
import java.lang.*;
public class number_palindreome
{
	public static void main(String args[])
	{
		int n,i=0,len=0,r,pali=0;
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter the N value:");
		n=ob.nextInt();
		int ar[]=new int[10];
		int temp=n;
		while(temp>0)
		{ 		
			r=temp%10;
			ar[len]=r;
			temp=temp/10;
			len++;
		}
		
		while(i<len)
		{
			pali+=ar[i]*Math.pow(10,(len-i-1));
			System.out.println(pali);

			i++;
		}
		if(pali==n)
			System.out.println("Give number is palindrome");
		else
			System.out.println("Give number is  not a palindrome");

	}
}
