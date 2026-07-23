import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
	    int sr,rev=0,srn,ans=0,d;
	    sr=n*n;
	    while(n!=0)
		{
		    d=n%10;
		    rev = rev*10+d;
		    n=n/10;
		}
		srn=rev*rev;
		while(srn!=0)
        {
            d=srn%10;
            ans=ans*10+d;
            srn=srn/10;
        }
        if(ans==sr)
        System.out.print("Adam Number");
        else
        System.out.print("Not an Adam Number");
	}
}

