import java.io.*;
import java.util.*;

public class numeric_char_count
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		String s=new String();
		s=ob.nextLine();
		
		int i=0,count=0, len=s.length();

		while(i<len)
		{
			if(Character.isLetter(s.charAt(i)))
				count++;
			i++;
		}
System.out.println("Number of numeric character is "+count);
	}	
}
