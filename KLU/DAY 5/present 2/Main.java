import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int i,flag=0;
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int t = sc.nextInt();
        int low =0;
        int high = n-1;
        while(low<high)
        {
            int mid = (low+high)/2;
            if(mid==t)
            {
                flag=1;
                System.out.println("Present");
                break;
            }
            else if(mid<t)
            low = mid+1;
            else if(mid>t)
            high = mid-1;
        }
        if(flag==0)
        System.out.println("Not Present");
    }
}