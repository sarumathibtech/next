import java.io.*;
import java.util.*;
import java.lang.*;
public class count
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		String ch=new String();
	System.out.println("Enter the String");
		ch=ob.nextLine();
		
		
		 int i=0,digit=0,letter=0,other=0;
		 		
		int len=ch.length();
		 while(i<len)
		 {  
			if(Character.isDigit(ch.charAt(i)))
			    digit++;
			else if(Character.isLetter(ch.charAt(i)))
				 letter++;
			else
				 other++;
			 i++;
		 }
		 System.out.println("The String "+ch+" containg ");
		 System.out.println("\ncharacters count is "+letter);
		 System.out.println("digits count is "+digit);
		 System.out.println("other characters count is "+other);
		 
	
	}
}
