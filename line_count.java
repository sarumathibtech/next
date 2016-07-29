import java.io.*; 
import java.util.*; 
class file
{  
 public static void main(String args[]){  
  try{
 
 String c= new String();
	Scanner ob=new Scanner(System.in);	
   FileReader fr=new FileReader("S.txt");  
   int i,count=0;  
  while((i=fr.read())!=-1) 
  {
	  
	System.out.println((char)i);  
	
			if((char)i=='\n')
			{
			   count++;	
			}
  }
  fr.close();  
  }catch(Exception e){System.out.println(e);}  
  
 }  
}  
