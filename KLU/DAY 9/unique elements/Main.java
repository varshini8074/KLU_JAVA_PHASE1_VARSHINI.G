import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int freq[] = new int[256];
        String s = obj.nextLine();
        int count =0,i;
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for(i=0;i<256;i++)
        {
            if(freq[i]==1){
                count++;
            }
        }
        System.out.println("unique elements count"+count);
    }
}