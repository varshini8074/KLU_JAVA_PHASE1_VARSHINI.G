import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int d,ans=0;
        while(n!=0)
        {
            d=n%10;
            ans=ans*10+d;
            n=n/10;
        }
        System.out.print("Reverse Number "+ans);
    }
}