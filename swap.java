import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class swap
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner ob=new Scanner(System.in);
	int c=ob.nextInt();
	int b=ob.nextInt();
	int a;
	a=c;
	c=b;
	b=a;
	System.out.print(c+" " + b);// your code goes here
	}
}
