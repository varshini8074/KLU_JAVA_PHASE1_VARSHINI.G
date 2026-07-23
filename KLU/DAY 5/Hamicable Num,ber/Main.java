import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int n1=obj.nextInt();
		int n2=obj.nextInt();
		int sum1=0,sum2=0,i;
		for(i=1;i<=n1/2;i++){
		    if(n1%i==0)
		    sum1=sum1+i;
		}
		for(i=1;i<=n2/2;i++){
		    if(n2%i==0)
		    sum2=sum2+i;
		}
		if(n1==sum2 && n2==sum1)
		System.out.print("Amicable Number");
		else
		System.out.print("Not an Amicable Number");
	}
}
