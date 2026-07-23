import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int temp=n;
		int sum=0,d;
		while(n!=0){
		    d=n%10;
		    sum+=d;
		    n=n/10;
		    
		}
		if(temp%sum==0)
		System.out.print("Harshad Number");
		else
		System.out.print("Not a Harshad Number");
		
		
	}
}