import java.io.*;
import java.util.*;

class AsciiProgram
{
    public static void main(String args[])
    {
	
        char ch;
        int i;
		Scanner ob=new Scanner(System.in);
		System.out.println("Ascii charecters");
        for(i=1; i<=255; i++)
        {
            ch = (chasr)i;
			System.out.print(i+ " -> " + ch + "\t");
        }
    }
}
