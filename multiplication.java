import java.io.*;
import java.util.*;

public class multiplication
{
	public static void main(String args[])
	{
		int start_multiplicant,end_multiplicant,multiplayer,i,mul;
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter the start_mutipicant and end_multiplicant values:");
		start_multiplicant=ob.nextInt();
		end_multiplicant=ob.nextInt();
		System.out.println("Enter the multiplayer value:");
		multiplayer=ob.nextInt();
		
		for(i=start_multiplicant;i<=end_multiplicant;i++)
		{
				mul=i*multiplayer;
				System.out.println(i+"*"+multiplayer+"="+mul);
		}
	}
}
