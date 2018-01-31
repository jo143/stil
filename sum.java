/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner ob=new Scanner(System.in);
	int x=ob.nextInt();
	int n;
	int sum=0;
	while(x!=0)
	{
		n=x%10;
		sum=sum+n;
		x=x/10;
	}// your code goes here
	System.out.println(sum);
	}
}
