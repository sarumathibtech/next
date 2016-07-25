import java.io.*;
import java.util.*;
import java.lang.*;
public class prime_num
{
	public static void main(String args[])
	{
		int num,i,p=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the N value:");
		num=ob.nextInt();
		for(i=2;i<=Math.floor(num/2);i++)
		{
			 if(num==2||num==1)
			 {
				 break;
			 }
			else if(num%i==0)
			{
				p=1;
				break;
			}
				
		}
		if(p==1)
			System.out.println("Given number "+num+" is not a prime");
		else
			System.out.println("Given number "+num+" is  a prime");

			
	}
}
