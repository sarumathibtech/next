import java.io.*;
import java.util.*;
import java.lang.*;
public class number_of_character
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the character:");
		String c= new String();
		c=ob.nextLine();
		int count=0,i=0;
		int len=c.length();
					   //System.out.println(len);

		while(i<len)
		{
			
			if(c.charAt(i)!=' ')
			{
			   count++;	
			}
			i++;
		}
		System.out.println("Number of the characters is "+count);
	}
}
