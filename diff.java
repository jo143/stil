/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class diff
{
	public static void main (String[] args)
	{
	Scanner ob=new Scanner(System.in);
	int k=ob.nextInt();
	int b=ob.nextInt();
	int c=k-b;
	if(c%2==0)
	{
		System.out.print("even");
	}
	else
	{
		System.out.print("odd");
	}
	}
}
