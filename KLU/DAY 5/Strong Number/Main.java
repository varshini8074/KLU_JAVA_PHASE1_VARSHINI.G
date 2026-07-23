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
		int d,i,fact,sum=0;
		while(n!=0){
		    d=n%10;
		    fact=1;
		    for(i=1;i<=d;i++){
		        fact = fact*i;
		    }
		    sum = sum+fact;
		    n=n/10;
		    
		}
		if(sum==temp)
		System.out.print("Strong Number");
		else
		System.out.print("Not a Strong Number");
		

	}
}
