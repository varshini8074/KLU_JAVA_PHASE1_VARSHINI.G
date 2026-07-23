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
		int c=0,d,p,sum=0;
		while(n!=0){
		    n/=10;
		    c++;
		    }
		    n=temp;
		    while(n!=0){
		        d=n%10;
		        p=(int)Math.pow(d,c);
		        sum=sum+p;
		        n=n/10;
		    }
		if(sum==temp)
		System.out.print("ArmStrong Number");
		else
		System.out.print("Not a ArmStrong Number");
		

	}
}



