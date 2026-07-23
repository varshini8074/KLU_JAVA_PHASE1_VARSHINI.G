import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) {
	    Scanner obj = new Scanner(System.in);
	    int n = obj.nextInt();
	    int i,flag=0;
	    int arr[]=new int[n];
	    for(i=0;i<n;i++)
	    arr[i]=obj.nextInt();
	    int s = obj.nextInt();
	    for(i=0;i<n;i++)
	    if(arr[i] == s){
	        System.out.print("Present");
	        flag = 1;
	        break;
	    }
	    if(flag == 0){
	        System.out.print("Not Present");
	    }
	}
}