import java.io.*;
import java.util.*;
import java.lang.*;
public class exit
{
	public static void main(String args[])
	{
		 char s;
		 Scanner ob=new Scanner(System.in);
		 
		 
		 System.out.println("Enter the any character:");
			s=ob.nextLine().charAt(0);
		
		switch(s)
		{
			case 'Q':
					System.exit(0);
					
			default:
				System.out.println("you enter the character is "+s);
				
		}
	}
}
